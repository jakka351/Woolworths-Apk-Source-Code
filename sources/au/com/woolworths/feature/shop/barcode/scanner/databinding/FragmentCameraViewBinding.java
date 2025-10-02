package au.com.woolworths.feature.shop.barcode.scanner.databinding;

import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class FragmentCameraViewBinding extends ViewDataBinding {
    public static final /* synthetic */ int z = 0;
    public final PreviewView y;

    public FragmentCameraViewBinding(DataBindingComponent dataBindingComponent, View view, PreviewView previewView) {
        super(dataBindingComponent, view, 0);
        this.y = previewView;
    }
}
