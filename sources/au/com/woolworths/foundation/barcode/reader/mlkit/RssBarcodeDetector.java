package au.com.woolworths.foundation.barcode.reader.mlkit;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import java.util.ArrayList;
import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/mlkit/RssBarcodeDetector;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RssBarcodeDetector {

    /* renamed from: a, reason: collision with root package name */
    public final MultiFormatReader f8475a;

    public RssBarcodeDetector() {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.p);
        arrayList.add(BarcodeFormat.q);
        enumMap.put((EnumMap) DecodeHintType.e, (DecodeHintType) arrayList);
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.c(enumMap);
        this.f8475a = multiFormatReader;
    }
}
