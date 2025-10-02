package com.google.android.material.textfield;

import android.hardware.camera2.CaptureRequest;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ CaptureRequest.Key f() {
        return new CaptureRequest.Key("org.codeaurora.qcamera3.sharpness.strength", int[].class);
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr h(CellIdentity cellIdentity) {
        return (CellIdentityNr) cellIdentity;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr j(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma k(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* bridge */ /* synthetic */ boolean n(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }

    public static /* synthetic */ CaptureRequest.Key o() {
        return new CaptureRequest.Key("org.codeaurora.qcamera3.sessionParameters.enableMFNR", int[].class);
    }

    public static /* bridge */ /* synthetic */ boolean r(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* synthetic */ CaptureRequest.Key s() {
        return new CaptureRequest.Key("org.codeaurora.qcamera3.contrast.level", int[].class);
    }

    public static /* synthetic */ CaptureRequest.Key t() {
        return new CaptureRequest.Key("samsung.android.control.setBarcodeApp", Integer.TYPE);
    }
}
