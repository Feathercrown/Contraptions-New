Remove-Item -Path './TestPlugin/app/build/distributions/app/' -Recurse
Expand-Archive -Path './TestPlugin/app/build/distributions/app.zip' -DestinationPath './TestPlugin/app/build/distributions/app/'
Copy-Item -Path './TestPlugin/app/build/distributions/app/app/lib/app.jar' -Destination './Paper Server/plugins'
