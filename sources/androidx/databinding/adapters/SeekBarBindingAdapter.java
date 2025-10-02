package androidx.databinding.adapters;

import android.widget.SeekBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.InverseBindingMethods;

@InverseBindingMethods
@RestrictTo
/* loaded from: classes2.dex */
public class SeekBarBindingAdapter {

    public interface OnProgressChanged {
        void onProgressChanged(SeekBar seekBar, int i, boolean z);
    }

    public interface OnStartTrackingTouch {
    }

    public interface OnStopTrackingTouch {
    }

    public static void a(SeekBar seekBar, final OnProgressChanged onProgressChanged) {
        if (onProgressChanged == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: androidx.databinding.adapters.SeekBarBindingAdapter.1
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    OnProgressChanged onProgressChanged2 = onProgressChanged;
                    if (onProgressChanged2 != null) {
                        onProgressChanged2.onProgressChanged(seekBar2, i, z);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar2) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar2) {
                }
            });
        }
    }
}
