package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/data/StructuredAppendDataProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendDataProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "isComplete", "()Z", "", "getBarcodeSetId", "()Ljava/lang/String;", "barcodeSetId", "", "getScannedSegmentCount", "()I", "scannedSegmentCount", "getTotalSegmentCount", "totalSegmentCount", "", "Lcom/scandit/datacapture/core/common/buffer/EncodingRange;", "getEncodingRanges", "()Ljava/util/List;", "encodingRanges", "getCompleteData", "completeData", "", "getRawCompleteData", "()[B", "rawCompleteData", "_NativeAbstractStructuredAppendData", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class StructuredAppendDataProxyAdapter implements StructuredAppendDataProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAbstractStructuredAppendData f17614a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public StructuredAppendDataProxyAdapter(@NotNull NativeAbstractStructuredAppendData _NativeAbstractStructuredAppendData, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAbstractStructuredAppendData, "_NativeAbstractStructuredAppendData");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17614a = _NativeAbstractStructuredAppendData;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAbstractStructuredAppendData getF17614a() {
        return this.f17614a;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @NotNull
    public String getBarcodeSetId() {
        String _0 = this.f17614a.getBarcodeSetId();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @Nullable
    public String getCompleteData() {
        return this.f17614a.getCompleteDataUtf8String();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @NotNull
    public List<EncodingRange> getEncodingRanges() {
        ArrayList<EncodingRange> _0 = this.f17614a.getCompleteDataEncodings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @NotNull
    public byte[] getRawCompleteData() {
        byte[] _0 = this.f17614a.getCompleteDataRaw();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public int getScannedSegmentCount() {
        return this.f17614a.getScannedSegmentCount();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public int getTotalSegmentCount() {
        return this.f17614a.getTotalSegmentCount();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public boolean isComplete() {
        return this.f17614a.isComplete();
    }

    public /* synthetic */ StructuredAppendDataProxyAdapter(NativeAbstractStructuredAppendData nativeAbstractStructuredAppendData, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAbstractStructuredAppendData, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
