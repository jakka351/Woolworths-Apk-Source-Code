package com.woolworths.scanlibrary.util.beacon.bluecats;

import android.bluetooth.le.ScanRecord;
import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.domain.productsearch.a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/bluecats/BlueCatsBeaconParser;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlueCatsBeaconParser {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f21363a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/bluecats/BlueCatsBeaconParser$Companion;", "", "", "ADDRESS_START_INDEX", "I", "ADDRESS_END_INDEX", "MANUFACTURER_ID_BLUECATS", "", "INVALID_BEACON_ADDRESS", "Ljava/lang/String;", "", "BLUCATS_ADV_TYPE1", "B", "UNKNOWN_BEACON_TYPE", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BlueCatsBeaconParser(ScanRecord scanRecord) {
        SparseArray<byte[]> manufacturerSpecificData = scanRecord != null ? scanRecord.getManufacturerSpecificData() : null;
        if (manufacturerSpecificData != null) {
            int size = manufacturerSpecificData.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = manufacturerSpecificData.keyAt(i);
                if (iKeyAt == 260) {
                    this.f21363a = (byte[]) manufacturerSpecificData.get(iKeyAt).clone();
                    return;
                }
            }
        }
    }

    public final String a() {
        String strT;
        byte[] bArr = this.f21363a;
        return (bArr == null || (strT = ArraysKt.T(ArraysKt.y(bArr, 1, 7), "", new a(18), 30)) == null) ? "invalid_address" : strT;
    }
}
