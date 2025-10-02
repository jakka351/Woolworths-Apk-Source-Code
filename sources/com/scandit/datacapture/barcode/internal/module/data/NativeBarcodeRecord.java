package com.scandit.datacapture.barcode.internal.module.data;

import com.scandit.datacapture.barcode.data.CompositeFlag;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeBarcodeRecord {
    final String addOnData;
    final boolean colorInverted;
    final String compositeData;
    final CompositeFlag compositeFlag;
    final byte[] compositeRawData;
    final byte[] data;
    final ArrayList<EncodingRange> dataEncoding;
    final int frameId;
    final boolean gs1DataCarrier;
    final Quadrilateral location;
    final boolean structuredAppend;
    final int symbolCount;
    final Symbology symbology;
    final String utf8String;

    public NativeBarcodeRecord(Symbology symbology, ArrayList<EncodingRange> arrayList, String str, boolean z, CompositeFlag compositeFlag, int i, int i2, boolean z2, byte[] bArr, String str2, String str3, byte[] bArr2, boolean z3, Quadrilateral quadrilateral) {
        this.symbology = symbology;
        this.dataEncoding = arrayList;
        this.utf8String = str;
        this.gs1DataCarrier = z;
        this.compositeFlag = compositeFlag;
        this.frameId = i;
        this.symbolCount = i2;
        this.colorInverted = z2;
        this.data = bArr;
        this.addOnData = str2;
        this.compositeData = str3;
        this.compositeRawData = bArr2;
        this.structuredAppend = z3;
        this.location = quadrilateral;
    }

    public String getAddOnData() {
        return this.addOnData;
    }

    public boolean getColorInverted() {
        return this.colorInverted;
    }

    public String getCompositeData() {
        return this.compositeData;
    }

    public CompositeFlag getCompositeFlag() {
        return this.compositeFlag;
    }

    public byte[] getCompositeRawData() {
        return this.compositeRawData;
    }

    public byte[] getData() {
        return this.data;
    }

    public ArrayList<EncodingRange> getDataEncoding() {
        return this.dataEncoding;
    }

    public int getFrameId() {
        return this.frameId;
    }

    public boolean getGs1DataCarrier() {
        return this.gs1DataCarrier;
    }

    public Quadrilateral getLocation() {
        return this.location;
    }

    public boolean getStructuredAppend() {
        return this.structuredAppend;
    }

    public int getSymbolCount() {
        return this.symbolCount;
    }

    public Symbology getSymbology() {
        return this.symbology;
    }

    public String getUtf8String() {
        return this.utf8String;
    }

    public String toString() {
        return "NativeBarcodeRecord{symbology=" + this.symbology + ",dataEncoding=" + this.dataEncoding + ",utf8String=" + this.utf8String + ",gs1DataCarrier=" + this.gs1DataCarrier + ",compositeFlag=" + this.compositeFlag + ",frameId=" + this.frameId + ",symbolCount=" + this.symbolCount + ",colorInverted=" + this.colorInverted + ",data=" + this.data + ",addOnData=" + this.addOnData + ",compositeData=" + this.compositeData + ",compositeRawData=" + this.compositeRawData + ",structuredAppend=" + this.structuredAppend + ",location=" + this.location + "}";
    }
}
