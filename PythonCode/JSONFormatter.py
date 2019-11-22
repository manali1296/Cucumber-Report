import json

reportFile=open('../target/json-report/report.json','r')
content=reportFile.read()
ObjectContent=json.loads(content)
reportFile.close()


outputFile={

    'features':[]
}
finalStepsPassed=0;
finalStepsFail=0;
finalStepsSkipped=0;
finalExPass=0;
finalExFail=0;
finalScenarioPassed=0;
finalScenarioFailed=0;

for element in ObjectContent:
    name=element['name'];
    totalStepPass=0;
    totalStepFail=0;
    totalStepSkipped=0;
    totalExPass=0;
    totalExFail=0;
    totalScenarioPass=set();
    totalScenarioFail=set();
    Totaltime=0

    for scenario_data in element['elements']:
        totalExStepPass=0;
        totalExStepsFail=0;
        for stepData in scenario_data['steps']:
            if stepData['result']['status']=='passed':
                totalStepPass=totalStepPass+1;
                totalExStepPass=totalExStepPass+1;
                TotalTime=Totaltime+stepData["result"]["duration"]

            elif stepData['result']['status']=='failed':
                totalStepFail=totalStepFail+1;
                totalExStepsFail=totalExStepsFail+1;
            elif stepData['result']['status']=='skipped':
                totalStepSkipped=totalStepSkipped+1;
                totalExStepsFail=totalExStepsFail+1;

        if totalExStepsFail>0:
            totalExFail=totalExFail+1;
        else:
            totalExPass=totalExPass+1;

        scenarioName=scenario_data['name'];
        if totalExStepsFail>0:
            totalScenarioFail.add(scenarioName);
            if scenarioName in totalScenarioPass:
                totalScenarioPass.remove(scenarioName);
        else:
            if scenarioName not in totalScenarioFail:
                totalScenarioPass.add(scenarioName);
   
    finalStepsPassed=finalStepsPassed+totalStepPass;
    finalStepsFail=finalStepsFail+totalStepFail;
    finalStepsSkipped=finalStepsSkipped+totalStepSkipped;
    finalExPass=finalExPass+totalExPass;
    finalExFail=finalExFail+totalExFail;
    finalScenarioPassed=finalScenarioPassed+len(totalScenarioPass);
    finalScenarioFailed=finalScenarioFailed+len(totalScenarioFail);

    if len(totalScenarioFail)>0:
        status='Failed'
    else:
        status='Passed'

    featureFileName={
        'FeatureFileName':name,
        'TotalStepsPass':totalStepPass,
        'TotalStepFail': totalStepFail,
        'TotalStepSkipped':totalStepSkipped,
        'TotalStepCount':totalStepPass+totalStepFail+totalStepSkipped,
        'ExamplePass':totalExPass,
        'ExampleFail':totalExFail,
        'TotalExCount':totalExPass+totalExFail,
        'TotalScenarioPass':len(totalScenarioPass),
        'TotalScenarioFail':len(totalScenarioFail),
        'TotalScenarioCount':len(totalScenarioPass)+len(totalScenarioFail),
        'duration':round(TotalTime/(60*60*1000*1000*1000),2),
        'Status':status
    }
    outputFile['features'].append(featureFileName)
if finalStepsPassed==0:
    stepPassPercentage=0;
else:
    stepPassPercentage=finalStepsPassed/(finalStepsPassed+finalStepsFail+finalStepsSkipped);
    stepPassPercentage=round(stepPassPercentage,2);
if finalStepsFail==0:
    stepFailedPercentage=0;
else:
    stepFailedPercentage=finalStepsFail/(finalStepsPassed+finalStepsFail+finalStepsSkipped);
    stepFailedPercentage=round(stepFailedPercentage,2);
if finalStepsSkipped==0:
    stepsSkippedPercentage=0;
else:
    stepsSkippedPercentage=finalStepsSkipped/(finalStepsPassed+finalStepsFail+finalStepsSkipped);
    stepsSkippedPercentage=round(stepsSkippedPercentage,2);
if finalExPass==0:
    examplePassPercentage=0;
else:
    examplePassPercentage=finalExPass/(finalExPass+finalExFail);
    examplePassPercentage=round(examplePassPercentage,2);
if finalExFail==0:
    exampleFailedPercentage=0;
else:
    exampleFailedPercentage=finalExFail/(finalExPass+finalExFail);
    exampleFailedPercentage=round(exampleFailedPercentage,2);
if finalScenarioPassed==0:
    scenarioPassedPercentage=0;
else:
    scenarioPassedPercentage=finalScenarioPassed/(finalScenarioPassed+finalScenarioPassed);
    scenarioPassedPercentage=round(scenarioPassedPercentage,2)
if finalScenarioFailed==0:
    scenarioFailedPercentage=0;
else:
    scenarioFailedPercentage=finalScenarioFailed/(finalExPass+finalScenarioFailed);
    scenarioFailedPercentage=round(scenarioFailedPercentage,2)

outputFile.update({
    "TotalStepsPassCount":finalStepsPassed,
    "TotalStepsFailedCount":finalStepsFail,
    "TotalStepsSkippedCount":finalStepsSkipped,
    "TotalStepsPassFailCount":finalStepsPassed+finalStepsFail+finalStepsSkipped,
    "TotalExPassCount":finalExPass,
    "TotalExFailCount":finalExFail,
    "TotalExPassFailCount":finalExPass+finalExFail,
    "TotalScenarioPassCount":finalScenarioPassed,
    "TotalScenarioFailedCount":finalScenarioFailed,
    "TotalPassFailScenarioCount":finalScenarioPassed+finalScenarioFailed,
    "StepsPassedPercentage":stepPassPercentage,
    "StepsFailedPercentage":stepFailedPercentage,
    "StepsSkippedPercentage":stepsSkippedPercentage,
    "ExamplePassPercentage":examplePassPercentage,
    "ExampleFailPercentage":exampleFailedPercentage,
    "ScenarioPassPercentage":scenarioPassedPercentage,
    "ScenarioFailedPercentage":scenarioFailedPercentage
})


file=open('../PythonCode/ReportTemplate.html','r')
content=file.read()
file.close()

reportData=json.dumps(outputFile)
content=content.replace('#reportData',reportData)
file= open('../target/CustomisedReport/Output.html','w+')
file.write(content)
file.close()