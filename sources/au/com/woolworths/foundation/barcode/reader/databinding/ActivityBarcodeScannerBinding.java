package au.com.woolworths.foundation.barcode.reader.databinding;

import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes4.dex */
public final class ActivityBarcodeScannerBinding implements ViewBinding {
    public final ConstraintLayout d;
    public final FrameLayout e;
    public final PreviewView f;

    public ActivityBarcodeScannerBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, PreviewView previewView) {
        this.d = constraintLayout;
        this.e = frameLayout;
        this.f = previewView;
    }
}
