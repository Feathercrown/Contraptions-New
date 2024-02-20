Remove-Item -Path './Contraptions/app/build/distributions/app/' -Recurse
Expand-Archive -Path './Contraptions/app/build/distributions/app.zip' -DestinationPath './Contraptions/app/build/distributions/app/'
Copy-Item -Path './Contraptions/app/build/distributions/app/app/lib/app.jar' -Destination './Paper Server/plugins'
