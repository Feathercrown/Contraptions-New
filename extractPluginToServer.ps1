Remove-Item -Path './Contraptions/app/build/distributions/contraptions/' -Recurse
Expand-Archive -Path './Contraptions/app/build/distributions/contraptions.zip' -DestinationPath './Contraptions/app/build/distributions/contraptions/'
Copy-Item -Path './Contraptions/app/build/distributions/contraptions/contraptions/lib/contraptions.jar' -Destination './Paper Server/plugins'
