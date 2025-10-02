package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter;
import com.scandit.datacapture.barcode.spark.ui.SparkScanToastSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.hd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0657hd implements SparkScanViewToastPresenter {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0769od f17699a;
    private final SparkScanViewSettings b;
    private final Pd c;
    private AbstractC0800qb d;
    private Function0 e;

    public C0657hd(SparkScanViewMiniPreview toastHolder, SparkScanViewSettings settings, Pd handler) {
        Intrinsics.h(toastHolder, "toastHolder");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(handler, "handler");
        this.f17699a = toastHolder;
        this.b = settings;
        this.c = handler;
        this.e = new C0641gd(this);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter
    public final void a(AbstractC0800qb toast) {
        C0625fd c0625fd;
        Intrinsics.h(toast, "toast");
        SparkScanToastSettings toastSettings = this.b.getToastSettings();
        if (toast instanceof C0687jb) {
            String targetModeEnabledMessage = toastSettings.getTargetModeEnabledMessage();
            if (targetModeEnabledMessage == null) {
                targetModeEnabledMessage = ((C0687jb) toast).c();
            }
            Integer toastBackgroundColor = toastSettings.getToastBackgroundColor();
            int iIntValue = toastBackgroundColor != null ? toastBackgroundColor.intValue() : toast.a();
            Integer toastTextColor = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue, toastTextColor != null ? toastTextColor.intValue() : toast.b(), targetModeEnabledMessage);
        } else if (toast instanceof C0671ib) {
            String targetModeDisabledMessage = toastSettings.getTargetModeDisabledMessage();
            if (targetModeDisabledMessage == null) {
                targetModeDisabledMessage = ((C0671ib) toast).c();
            }
            Integer toastBackgroundColor2 = toastSettings.getToastBackgroundColor();
            int iIntValue2 = toastBackgroundColor2 != null ? toastBackgroundColor2.intValue() : toast.a();
            Integer toastTextColor2 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue2, toastTextColor2 != null ? toastTextColor2.intValue() : toast.b(), targetModeDisabledMessage);
        } else if (toast instanceof C0607eb) {
            String continuousModeEnabledMessage = toastSettings.getContinuousModeEnabledMessage();
            if (continuousModeEnabledMessage == null) {
                continuousModeEnabledMessage = ((C0607eb) toast).c();
            }
            Integer toastBackgroundColor3 = toastSettings.getToastBackgroundColor();
            int iIntValue3 = toastBackgroundColor3 != null ? toastBackgroundColor3.intValue() : toast.a();
            Integer toastTextColor3 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue3, toastTextColor3 != null ? toastTextColor3.intValue() : toast.b(), continuousModeEnabledMessage);
        } else if (toast instanceof C0591db) {
            String continuousModeDisabledMessage = toastSettings.getContinuousModeDisabledMessage();
            if (continuousModeDisabledMessage == null) {
                continuousModeDisabledMessage = ((C0591db) toast).c();
            }
            Integer toastBackgroundColor4 = toastSettings.getToastBackgroundColor();
            int iIntValue4 = toastBackgroundColor4 != null ? toastBackgroundColor4.intValue() : toast.a();
            Integer toastTextColor4 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue4, toastTextColor4 != null ? toastTextColor4.intValue() : toast.b(), continuousModeDisabledMessage);
        } else if (toast instanceof C0655hb) {
            String scanPausedMessage = toastSettings.getScanPausedMessage();
            if (scanPausedMessage == null) {
                scanPausedMessage = ((C0655hb) toast).c();
            }
            Integer toastBackgroundColor5 = toastSettings.getToastBackgroundColor();
            int iIntValue5 = toastBackgroundColor5 != null ? toastBackgroundColor5.intValue() : toast.a();
            Integer toastTextColor5 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue5, toastTextColor5 != null ? toastTextColor5.intValue() : toast.b(), scanPausedMessage);
        } else if (toast instanceof C0719lb) {
            String torchEnabledMessage = toastSettings.getTorchEnabledMessage();
            if (torchEnabledMessage == null) {
                torchEnabledMessage = ((C0719lb) toast).c();
            }
            Integer toastBackgroundColor6 = toastSettings.getToastBackgroundColor();
            int iIntValue6 = toastBackgroundColor6 != null ? toastBackgroundColor6.intValue() : toast.a();
            Integer toastTextColor6 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue6, toastTextColor6 != null ? toastTextColor6.intValue() : toast.b(), torchEnabledMessage);
        } else if (toast instanceof C0703kb) {
            String torchDisabledMessage = toastSettings.getTorchDisabledMessage();
            if (torchDisabledMessage == null) {
                torchDisabledMessage = ((C0703kb) toast).c();
            }
            Integer toastBackgroundColor7 = toastSettings.getToastBackgroundColor();
            int iIntValue7 = toastBackgroundColor7 != null ? toastBackgroundColor7.intValue() : toast.a();
            Integer toastTextColor7 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue7, toastTextColor7 != null ? toastTextColor7.intValue() : toast.b(), torchDisabledMessage);
        } else if (toast instanceof C0767ob) {
            String zoomedInMessage = toastSettings.getZoomedInMessage();
            if (zoomedInMessage == null) {
                zoomedInMessage = ((C0767ob) toast).c();
            }
            Integer toastBackgroundColor8 = toastSettings.getToastBackgroundColor();
            int iIntValue8 = toastBackgroundColor8 != null ? toastBackgroundColor8.intValue() : toast.a();
            Integer toastTextColor8 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue8, toastTextColor8 != null ? toastTextColor8.intValue() : toast.b(), zoomedInMessage);
        } else if (toast instanceof C0782pb) {
            String zoomedOutMessage = toastSettings.getZoomedOutMessage();
            if (zoomedOutMessage == null) {
                zoomedOutMessage = ((C0782pb) toast).c();
            }
            Integer toastBackgroundColor9 = toastSettings.getToastBackgroundColor();
            int iIntValue9 = toastBackgroundColor9 != null ? toastBackgroundColor9.intValue() : toast.a();
            Integer toastTextColor9 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue9, toastTextColor9 != null ? toastTextColor9.intValue() : toast.b(), zoomedOutMessage);
        } else if (toast instanceof C0735mb) {
            String userFacingCameraEnabledMessage = toastSettings.getUserFacingCameraEnabledMessage();
            if (userFacingCameraEnabledMessage == null) {
                userFacingCameraEnabledMessage = ((C0735mb) toast).c();
            }
            Integer toastBackgroundColor10 = toastSettings.getToastBackgroundColor();
            int iIntValue10 = toastBackgroundColor10 != null ? toastBackgroundColor10.intValue() : toast.a();
            Integer toastTextColor10 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue10, toastTextColor10 != null ? toastTextColor10.intValue() : toast.b(), userFacingCameraEnabledMessage);
        } else if (toast instanceof C0751nb) {
            String worldFacingCameraEnabledMessage = toastSettings.getWorldFacingCameraEnabledMessage();
            if (worldFacingCameraEnabledMessage == null) {
                worldFacingCameraEnabledMessage = ((C0751nb) toast).c();
            }
            Integer toastBackgroundColor11 = toastSettings.getToastBackgroundColor();
            int iIntValue11 = toastBackgroundColor11 != null ? toastBackgroundColor11.intValue() : toast.a();
            Integer toastTextColor11 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue11, toastTextColor11 != null ? toastTextColor11.intValue() : toast.b(), worldFacingCameraEnabledMessage);
        } else if (toast instanceof C0623fb) {
            String strC = ((C0623fb) toast).c();
            Integer toastBackgroundColor12 = toastSettings.getToastBackgroundColor();
            int iIntValue12 = toastBackgroundColor12 != null ? toastBackgroundColor12.intValue() : toast.a();
            Integer toastTextColor12 = toastSettings.getToastTextColor();
            c0625fd = new C0625fd(iIntValue12, toastTextColor12 != null ? toastTextColor12.intValue() : toast.b(), strC);
        } else {
            if (!(toast instanceof C0639gb)) {
                throw new NoWhenBranchMatchedException();
            }
            c0625fd = new C0625fd(toast.a(), toast.b(), ((C0639gb) toast).c());
        }
        if (!this.b.getToastSettings().getToastEnabled() || c0625fd.b().length() <= 0) {
            return;
        }
        ((Qd) this.c).a();
        this.d = toast;
        this.f17699a.a(c0625fd.a(), c0625fd.c(), c0625fd.b());
        AbstractC0800qb abstractC0800qb = this.d;
        if ((abstractC0800qb instanceof C0655hb) || (abstractC0800qb instanceof C0639gb)) {
            return;
        }
        ((Qd) this.c).a(this.e, this.b.getToastSettings().getToastDuration());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter
    public final void release() {
        ((Qd) this.c).a();
    }

    public /* synthetic */ C0657hd(SparkScanViewMiniPreview sparkScanViewMiniPreview, SparkScanViewSettings sparkScanViewSettings) {
        this(sparkScanViewMiniPreview, sparkScanViewSettings, new Qd());
    }

    public static final void a(C0657hd c0657hd) {
        c0657hd.d = null;
        c0657hd.f17699a.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter
    public final void a() {
        AbstractC0800qb abstractC0800qb = this.d;
        if (abstractC0800qb instanceof C0655hb) {
            this.d = null;
            this.f17699a.a();
        } else if (abstractC0800qb instanceof C0639gb) {
            this.d = null;
            this.f17699a.a();
        }
    }
}
