package sarbala.godot.plugin.android.godottoast;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import android.widget.Toast;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;

public class GodotToast extends GodotPlugin {
    private static final String TAG = "godot";
    private Activity activity;
    private Activity Tactivity = getActivity();

    public GodotToast(Godot godot) {
        super(godot);
        activity = godot.getActivity();
    }

    @UsedByGodot
    public void toastText(String text) {
        Tactivity.runOnUiThread(new Runnable() {
            public void run() {
            Toast.makeText(Tactivity, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GodotToast";
    }
}
