package com.example.flunamaexample;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import com.mapbox.mapboxsdk.Mapbox;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Mapbox.getInstance(this, "MAPBOX_ACCESS_TOKEN");
    GeneratedPluginRegistrant.registerWith(this);
  }
}
