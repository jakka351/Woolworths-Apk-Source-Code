package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes8.dex */
class NodeEntry {
    final int nodeHeight;
    final byte[] nodeValue;

    public NodeEntry(byte[] bArr, int i) {
        this.nodeValue = bArr;
        this.nodeHeight = i;
    }
}
