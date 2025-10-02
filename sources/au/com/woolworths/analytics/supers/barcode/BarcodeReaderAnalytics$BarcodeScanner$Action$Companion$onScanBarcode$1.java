package au.com.woolworths.analytics.supers.barcode;

import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.barcode.BarcodeReaderAnalytics;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/barcode/BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1", "Lau/com/woolworths/analytics/Event;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1 implements Event {
    public final Object d;

    public BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1(String str, String str2, String str3, String str4) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
        spreadBuilder.b(BarcodeReaderAnalytics.BarcodeScanner.e);
        spreadBuilder.a(new Pair("event.Label", a.m("event.Category", a.m("event.Action", "scan", spreadBuilder, str), spreadBuilder, str2)));
        spreadBuilder.a(new Pair("event.Description", str3));
        androidx.constraintlayout.core.state.a.y("event.Value", str4, spreadBuilder);
        ArrayList arrayList = spreadBuilder.f24269a;
        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getD() {
        return "scan_barcode";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return "scan_barcode".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }
}
