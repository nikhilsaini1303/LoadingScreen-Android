# LoadingScreen-Android

1. Create a new activity for the loading screen. Right-click on your app folder in the project panel, select "New" > "Activity" > "Empty Activity" and name it something like "LoadingScreenActivity".

2. Design the loading screen in XML layout file. Open the XML layout file for the new activity and design the loading screen as desired. This may include adding a logo, progress bar, or other UI elements to indicate that the app is loading.

3. Set the loading screen as the launcher activity. Create a LoadingAlert Class. and add the following code :
        
        
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loading_layout, null));

        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
        
 4.This will set the loading screen as the launcher activity, so that it is displayed when the app is launched.
 5. Implement the loading logic. In your main activity, add the code to load any data or resources that your app requires.
    i.e.
       LoadingAlert loadingAlert = new LoadingAlert(MainActivity.this);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 loadingAlert.startAlertDialog();
             }
         });
         
6. Click on button Start then loading screen is launched.
