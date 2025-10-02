package me.oriient.ipssdk.ips;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSCalibrationDialogShowListener;
import me.oriient.ipssdk.realtime.R;

/* loaded from: classes4.dex */
public final class c implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f25790a;
    public final /* synthetic */ IPSCalibrationDialogViewModel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ FragmentActivity f;
    public final /* synthetic */ IPSCalibrationDialog g;

    public c(IPSCalibrationDialog iPSCalibrationDialog, AlertDialog alertDialog, IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel, boolean z, boolean z2, boolean z3, FragmentActivity fragmentActivity) {
        this.g = iPSCalibrationDialog;
        this.f25790a = alertDialog;
        this.b = iPSCalibrationDialogViewModel;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = fragmentActivity;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ((Logger) this.g.logger.getValue()).d(IPSCalibrationDialog.TAG, "onShow() called with: dialog = [" + dialogInterface + "]");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f25790a.findViewById(R.id.calibration_image);
        Integer num = this.b.accentColor;
        if (num != null && !this.c) {
            this.g.colorDefaultAnimation(num.intValue(), lottieAnimationView);
        }
        lottieAnimationView.g();
        if (this.d) {
            Button button = ((AlertDialog) dialogInterface).getButton(-1);
            button.setOnClickListener(new a(this));
            Integer num2 = this.b.accentColor;
            if (num2 != null) {
                button.setTextColor(num2.intValue());
            }
        }
        if (this.e) {
            Button button2 = ((AlertDialog) dialogInterface).getButton(-2);
            button2.setOnClickListener(new b(this));
            Integer num3 = this.b.accentColor;
            if (num3 != null) {
                button2.setTextColor(num3.intValue());
            }
        }
        this.g.subscribeToUiComponents((AlertDialog) dialogInterface, this.f);
        IPSCalibrationDialogShowListener iPSCalibrationDialogShowListener = this.b.showListener;
        if (iPSCalibrationDialogShowListener != null) {
            iPSCalibrationDialogShowListener.onShow();
        }
    }
}
