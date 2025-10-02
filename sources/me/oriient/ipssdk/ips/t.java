package me.oriient.ipssdk.ips;

/* loaded from: classes4.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSCalibrationDialogViewModel f25807a;

    public t(IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel) {
        this.f25807a = iPSCalibrationDialogViewModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25807a.dismissSuccess();
    }
}
