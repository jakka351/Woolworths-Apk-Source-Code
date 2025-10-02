package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: classes6.dex */
final class Ec extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Ec f17152a = new Ec();

    public Ec() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(DilithiumEngine.DilithiumPolyT1PackedBytes, (Context) null, 1, (Object) null));
    }
}
