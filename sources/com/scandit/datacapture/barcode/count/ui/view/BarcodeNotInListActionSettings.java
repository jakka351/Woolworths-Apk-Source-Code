package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b&\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\"\u0010%\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010)\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010¨\u00060"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeNotInListActionSettings;", "", "", "a", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "b", "Ljava/lang/String;", "getAcceptButtonText", "()Ljava/lang/String;", "setAcceptButtonText", "(Ljava/lang/String;)V", "acceptButtonText", "c", "getAcceptButtonContentDescription", "setAcceptButtonContentDescription", "acceptButtonContentDescription", "d", "getRejectButtonText", "setRejectButtonText", "rejectButtonText", "e", "getRejectButtonContentDescription", "setRejectButtonContentDescription", "rejectButtonContentDescription", "f", "getCancelButtonText", "setCancelButtonText", "cancelButtonText", "g", "getCancelButtonContentDescription", "setCancelButtonContentDescription", "cancelButtonContentDescription", "h", "getBarcodeAcceptedHint", "setBarcodeAcceptedHint", "barcodeAcceptedHint", "i", "getBarcodeRejectedHint", "setBarcodeRejectedHint", "barcodeRejectedHint", "<init>", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeNotInListActionSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    private String acceptButtonText = RequestBuilder.ACCEPT;

    /* renamed from: c, reason: from kotlin metadata */
    private String acceptButtonContentDescription = RequestBuilder.ACCEPT;

    /* renamed from: d, reason: from kotlin metadata */
    private String rejectButtonText = "Reject";

    /* renamed from: e, reason: from kotlin metadata */
    private String rejectButtonContentDescription = "Reject";

    /* renamed from: f, reason: from kotlin metadata */
    private String cancelButtonText = "Cancel";

    /* renamed from: g, reason: from kotlin metadata */
    private String cancelButtonContentDescription = "Cancel";

    /* renamed from: h, reason: from kotlin metadata */
    private String barcodeAcceptedHint = "Barcode accepted";

    /* renamed from: i, reason: from kotlin metadata */
    private String barcodeRejectedHint = "Barcode rejected";

    @NotNull
    public final String getAcceptButtonContentDescription() {
        return this.acceptButtonContentDescription;
    }

    @NotNull
    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    @NotNull
    public final String getBarcodeAcceptedHint() {
        return this.barcodeAcceptedHint;
    }

    @NotNull
    public final String getBarcodeRejectedHint() {
        return this.barcodeRejectedHint;
    }

    @NotNull
    public final String getCancelButtonContentDescription() {
        return this.cancelButtonContentDescription;
    }

    @NotNull
    public final String getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getRejectButtonContentDescription() {
        return this.rejectButtonContentDescription;
    }

    @NotNull
    public final String getRejectButtonText() {
        return this.rejectButtonText;
    }

    public final void setAcceptButtonContentDescription(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.acceptButtonContentDescription = str;
    }

    public final void setAcceptButtonText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.acceptButtonText = str;
    }

    public final void setBarcodeAcceptedHint(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.barcodeAcceptedHint = str;
    }

    public final void setBarcodeRejectedHint(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.barcodeRejectedHint = str;
    }

    public final void setCancelButtonContentDescription(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.cancelButtonContentDescription = str;
    }

    public final void setCancelButtonText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.cancelButtonText = str;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setRejectButtonContentDescription(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.rejectButtonContentDescription = str;
    }

    public final void setRejectButtonText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.rejectButtonText = str;
    }
}
