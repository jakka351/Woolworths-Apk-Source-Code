package com.scandit.datacapture.barcode.generator;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "LOW", "MEDIUM", "QUARTILE", "HIGH", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public enum QrCodeErrorCorrectionLevel {
    LOW("Up to 7% damage"),
    MEDIUM("Up to 15% damage"),
    QUARTILE("Up to 25% damage"),
    HIGH("Up to 30% damage");


    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String description;

    QrCodeErrorCorrectionLevel(String str) {
        this.description = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }
}
