package com.woolworths.scanlibrary.ui.scanner;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScanditSymbologyNameMapper;", "Lcom/woolworths/scanlibrary/ui/scanner/BarcodeSymbologyNameMapper;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScanditSymbologyNameMapper extends BarcodeSymbologyNameMapper {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21320a = MapsKt.j(new Pair("CODE128", ApiSupportBarcodeSymbology.k), new Pair("EAN13_UPCA", ApiSupportBarcodeSymbology.g), new Pair("EAN8", ApiSupportBarcodeSymbology.f), new Pair("GS1_DATABAR", ApiSupportBarcodeSymbology.h), new Pair("QR", ApiSupportBarcodeSymbology.e), new Pair("UPCE", ApiSupportBarcodeSymbology.m), new Pair("DATA_MATRIX", ApiSupportBarcodeSymbology.i), new Pair("GS1DataMatrix", ApiSupportBarcodeSymbology.j), new Pair("GS1_DATABAR_EXPANDED", ApiSupportBarcodeSymbology.n), new Pair("CODE39", ApiSupportBarcodeSymbology.l), new Pair("SYNTHETIC_DATABAR", ApiSupportBarcodeSymbology.p));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map a() {
        return this.f21320a;
    }
}
