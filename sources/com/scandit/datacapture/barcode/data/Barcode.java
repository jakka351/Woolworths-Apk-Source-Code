package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.module.data.NativeBarcodeRecord;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0097\u0001R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010$\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b$\u0010\u0019R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010+\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010-\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0013\u0010/\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0011\u00101\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b0\u0010'R\u0011\u00102\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u0010\u0019¨\u00066"}, d2 = {"Lcom/scandit/datacapture/barcode/data/Barcode;", "Lcom/scandit/datacapture/barcode/data/BarcodeProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "_impl", "", "toJson", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "getStructuredAppendData", "()Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "structuredAppendData", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "", "Lcom/scandit/datacapture/core/common/buffer/EncodingRange;", "getEncodingRanges", "()Ljava/util/List;", "encodingRanges", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "", "isGs1DataCarrier", "()Z", "Lcom/scandit/datacapture/barcode/data/CompositeFlag;", "getCompositeFlag", "()Lcom/scandit/datacapture/barcode/data/CompositeFlag;", "compositeFlag", "", "getFrameId", "()I", "frameId", "getSymbolCount", "symbolCount", "isColorInverted", "", "getRawData", "()[B", "rawData", "getData", "()Ljava/lang/String;", "data", "getAddOnData", "addOnData", "getCompositeData", "compositeData", "getCompositeRawData", "compositeRawData", "isStructuredAppend", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class Barcode implements BarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeProxyAdapter f17603a;
    private final Lazy b;

    public Barcode(@NotNull NativeBarcode impl) {
        Intrinsics.h(impl, "impl");
        this.f17603a = new BarcodeProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.b = LazyKt.b(new a(this));
    }

    private final NativeBarcodeRecord a() {
        Object d = this.b.getD();
        Intrinsics.g(d, "<get-record>(...)");
        return (NativeBarcodeRecord) d;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcode getF17604a() {
        return this.f17603a.getF17604a();
    }

    @Nullable
    public final String getAddOnData() {
        return a().getAddOnData();
    }

    @Nullable
    public final String getCompositeData() {
        return a().getCompositeData();
    }

    @NotNull
    public final CompositeFlag getCompositeFlag() {
        CompositeFlag compositeFlag = a().getCompositeFlag();
        Intrinsics.g(compositeFlag, "record.compositeFlag");
        return compositeFlag;
    }

    @NotNull
    public final byte[] getCompositeRawData() {
        byte[] compositeRawData = a().getCompositeRawData();
        Intrinsics.g(compositeRawData, "record.compositeRawData");
        return compositeRawData;
    }

    @Nullable
    public final String getData() {
        return a().getUtf8String();
    }

    @NotNull
    public final List<EncodingRange> getEncodingRanges() {
        ArrayList<EncodingRange> dataEncoding = a().getDataEncoding();
        Intrinsics.g(dataEncoding, "record.dataEncoding");
        return dataEncoding;
    }

    public final int getFrameId() {
        return a().getFrameId();
    }

    @NotNull
    public final Quadrilateral getLocation() {
        Quadrilateral location = a().getLocation();
        Intrinsics.g(location, "record.location");
        return location;
    }

    @NotNull
    public final byte[] getRawData() {
        byte[] data = a().getData();
        Intrinsics.g(data, "record.data");
        return data;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @ProxyFunction(nativeName = "getStructuredAppendData", property = "structuredAppendData")
    @Nullable
    public StructuredAppendData getStructuredAppendData() {
        return this.f17603a.getStructuredAppendData();
    }

    public final int getSymbolCount() {
        return a().getSymbolCount();
    }

    @NotNull
    public final Symbology getSymbology() {
        Symbology symbology = a().getSymbology();
        Intrinsics.g(symbology, "record.symbology");
        return symbology;
    }

    public final boolean isColorInverted() {
        return a().getColorInverted();
    }

    public final boolean isGs1DataCarrier() {
        return a().getGs1DataCarrier();
    }

    public final boolean isStructuredAppend() {
        return a().getStructuredAppend();
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f17603a.toJson();
    }
}
