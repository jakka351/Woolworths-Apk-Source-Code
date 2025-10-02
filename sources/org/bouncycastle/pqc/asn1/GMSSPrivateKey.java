package org.bouncycastle.pqc.asn1;

import java.util.Vector;
import kotlin.reflect.jvm.internal.impl.types.checker.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.legacy.crypto.gmss.Treehash;

/* loaded from: classes8.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            iArr[i] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((DEROctetString) aSN1Sequence3.getObjectAt(i2)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            bArr2[i3] = ((DEROctetString) aSN1Sequence4.getObjectAt(i3)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i4 = 0; i4 < size3; i4++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i4);
            bArr3[i4] = new byte[aSN1Sequence6.size()][];
            int i5 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i4];
                if (i5 < bArr4.length) {
                    bArr4[i5] = ((DEROctetString) aSN1Sequence6.getObjectAt(i5)).getOctets();
                    i5++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i6 = 0; i6 < size4; i6++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i6);
            bArr5[i6] = new byte[aSN1Sequence8.size()][];
            int i7 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i6];
                if (i7 < bArr6.length) {
                    bArr6[i7] = ((DEROctetString) aSN1Sequence8.getObjectAt(i7)).getOctets();
                    i7++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        return ((ASN1Integer) aSN1Encodable).intValueExact();
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        int[] iArr3 = iArr;
        Treehash[][] treehashArr3 = treehashArr;
        Treehash[][] treehashArr4 = treehashArr2;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i = 0;
        while (i < iArr3.length) {
            aSN1EncodableVector2.add(new ASN1Integer(iArr[i]));
            i++;
            iArr3 = iArr;
        }
        ASN1EncodableVector aSN1EncodableVectorN = a.n(aSN1EncodableVector2, aSN1EncodableVector);
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVectorN.add(new DEROctetString(bArr8));
        }
        ASN1EncodableVector aSN1EncodableVectorN2 = a.n(aSN1EncodableVectorN, aSN1EncodableVector);
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVectorN2.add(new DEROctetString(bArr9));
        }
        ASN1EncodableVector aSN1EncodableVectorN3 = a.n(aSN1EncodableVectorN2, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i2 = 0; i2 < bArr3.length; i2++) {
            for (int i3 = 0; i3 < bArr3[i2].length; i3++) {
                aSN1EncodableVectorN3.add(new DEROctetString(bArr3[i2][i3]));
            }
            aSN1EncodableVectorN3 = a.n(aSN1EncodableVectorN3, aSN1EncodableVector3);
        }
        ASN1EncodableVector aSN1EncodableVectorN4 = a.n(aSN1EncodableVector3, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (int i4 = 0; i4 < bArr4.length; i4++) {
            for (int i5 = 0; i5 < bArr4[i4].length; i5++) {
                aSN1EncodableVectorN4.add(new DEROctetString(bArr4[i4][i5]));
            }
            aSN1EncodableVectorN4 = a.n(aSN1EncodableVectorN4, aSN1EncodableVector4);
        }
        ASN1EncodableVector aSN1EncodableVectorN5 = a.n(aSN1EncodableVector4, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        int i6 = 0;
        while (i6 < treehashArr3.length) {
            int i7 = 0;
            while (i7 < treehashArr3[i6].length) {
                aSN1EncodableVector6.add(new DERSequence(algorithmIdentifierArr[0]));
                int i8 = treehashArr3[i6][i7].getStatInt()[1];
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i6][i7].getStatByte()[0]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i6][i7].getStatByte()[1]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i6][i7].getStatByte()[2]));
                int i9 = 0;
                while (i9 < i8) {
                    aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i6][i7].getStatByte()[i9 + 3]));
                    i9++;
                    treehashArr3 = treehashArr;
                }
                aSN1EncodableVector7 = a.n(aSN1EncodableVector7, aSN1EncodableVector6);
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i6][i7].getStatInt()[0]));
                aSN1EncodableVector8.add(new ASN1Integer(i8));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i6][i7].getStatInt()[2]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i6][i7].getStatInt()[3]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i6][i7].getStatInt()[4]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i6][i7].getStatInt()[5]));
                int i10 = 0;
                while (i10 < i8) {
                    aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i6][i7].getStatInt()[i10 + 6]));
                    i10++;
                    i6 = i6;
                    i7 = i7;
                }
                aSN1EncodableVector8 = a.n(aSN1EncodableVector8, aSN1EncodableVector6);
                aSN1EncodableVector6 = a.n(aSN1EncodableVector6, aSN1EncodableVector5);
                i7++;
                treehashArr3 = treehashArr;
            }
            aSN1EncodableVector5 = a.n(aSN1EncodableVector5, aSN1EncodableVectorN5);
            i6++;
            treehashArr3 = treehashArr;
        }
        ASN1EncodableVector aSN1EncodableVectorN6 = a.n(aSN1EncodableVectorN5, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        int i11 = 0;
        while (i11 < treehashArr4.length) {
            int i12 = 0;
            while (i12 < treehashArr4[i11].length) {
                aSN1EncodableVector10.add(new DERSequence(algorithmIdentifierArr[0]));
                int i13 = treehashArr4[i11][i12].getStatInt()[1];
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i11][i12].getStatByte()[0]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i11][i12].getStatByte()[1]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i11][i12].getStatByte()[2]));
                for (int i14 = 0; i14 < i13; i14++) {
                    aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i11][i12].getStatByte()[i14 + 3]));
                }
                aSN1EncodableVector11 = a.n(aSN1EncodableVector11, aSN1EncodableVector10);
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i11][i12].getStatInt()[0]));
                aSN1EncodableVector12.add(new ASN1Integer(i13));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i11][i12].getStatInt()[2]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i11][i12].getStatInt()[3]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i11][i12].getStatInt()[4]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i11][i12].getStatInt()[5]));
                int i15 = 0;
                while (i15 < i13) {
                    aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i11][i12].getStatInt()[i15 + 6]));
                    i15++;
                    treehashArr4 = treehashArr2;
                    i11 = i11;
                }
                aSN1EncodableVector12 = a.n(aSN1EncodableVector12, aSN1EncodableVector10);
                aSN1EncodableVector10 = a.n(aSN1EncodableVector10, aSN1EncodableVector9);
                i12++;
                treehashArr4 = treehashArr2;
            }
            aSN1EncodableVectorN6.add(new DERSequence(new DERSequence(aSN1EncodableVector9)));
            aSN1EncodableVector9 = new ASN1EncodableVector();
            i11++;
            treehashArr4 = treehashArr2;
        }
        ASN1EncodableVector aSN1EncodableVectorN7 = a.n(aSN1EncodableVectorN6, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        for (int i16 = 0; i16 < bArr5.length; i16++) {
            for (int i17 = 0; i17 < bArr5[i16].length; i17++) {
                aSN1EncodableVectorN7.add(new DEROctetString(bArr5[i16][i17]));
            }
            aSN1EncodableVectorN7 = a.n(aSN1EncodableVectorN7, aSN1EncodableVector13);
        }
        ASN1EncodableVector aSN1EncodableVectorN8 = a.n(aSN1EncodableVector13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        for (int i18 = 0; i18 < vectorArr.length; i18++) {
            for (int i19 = 0; i19 < vectorArr[i18].size(); i19++) {
                aSN1EncodableVectorN8.add(new DEROctetString((byte[]) vectorArr[i18].elementAt(i19)));
            }
            aSN1EncodableVectorN8 = a.n(aSN1EncodableVectorN8, aSN1EncodableVector14);
        }
        ASN1EncodableVector aSN1EncodableVectorN9 = a.n(aSN1EncodableVector14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        for (int i20 = 0; i20 < vectorArr2.length; i20++) {
            for (int i21 = 0; i21 < vectorArr2[i20].size(); i21++) {
                aSN1EncodableVectorN9.add(new DEROctetString((byte[]) vectorArr2[i20].elementAt(i21)));
            }
            aSN1EncodableVectorN9 = a.n(aSN1EncodableVectorN9, aSN1EncodableVector15);
        }
        ASN1EncodableVector aSN1EncodableVectorN10 = a.n(aSN1EncodableVector15, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        for (int i22 = 0; i22 < vectorArr3.length; i22++) {
            for (int i23 = 0; i23 < vectorArr3[i22].length; i23++) {
                for (int i24 = 0; i24 < vectorArr3[i22][i23].size(); i24++) {
                    aSN1EncodableVectorN10.add(new DEROctetString((byte[]) vectorArr3[i22][i23].elementAt(i24)));
                }
                aSN1EncodableVectorN10 = a.n(aSN1EncodableVectorN10, aSN1EncodableVector16);
            }
            aSN1EncodableVector16 = a.n(aSN1EncodableVector16, aSN1EncodableVector17);
        }
        ASN1EncodableVector aSN1EncodableVectorN11 = a.n(aSN1EncodableVector17, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        for (int i25 = 0; i25 < vectorArr4.length; i25++) {
            for (int i26 = 0; i26 < vectorArr4[i25].length; i26++) {
                for (int i27 = 0; i27 < vectorArr4[i25][i26].size(); i27++) {
                    aSN1EncodableVectorN11.add(new DEROctetString((byte[]) vectorArr4[i25][i26].elementAt(i27)));
                }
                aSN1EncodableVectorN11 = a.n(aSN1EncodableVectorN11, aSN1EncodableVector18);
            }
            aSN1EncodableVector18 = a.n(aSN1EncodableVector18, aSN1EncodableVector19);
        }
        ASN1EncodableVector aSN1EncodableVectorN12 = a.n(aSN1EncodableVector19, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i28 = 0; i28 < gMSSLeafArr.length; i28++) {
            aSN1EncodableVector20.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i28].getStatByte();
            aSN1EncodableVector21.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i28].getStatInt();
            aSN1EncodableVector22.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector22));
            aSN1EncodableVector22 = new ASN1EncodableVector();
            aSN1EncodableVector20 = a.n(aSN1EncodableVector20, aSN1EncodableVectorN12);
        }
        ASN1EncodableVector aSN1EncodableVectorN13 = a.n(aSN1EncodableVectorN12, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        for (int i29 = 0; i29 < gMSSLeafArr2.length; i29++) {
            aSN1EncodableVector23.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i29].getStatByte();
            aSN1EncodableVector24.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector24));
            aSN1EncodableVector24 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i29].getStatInt();
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector25));
            aSN1EncodableVector25 = new ASN1EncodableVector();
            aSN1EncodableVector23 = a.n(aSN1EncodableVector23, aSN1EncodableVectorN13);
        }
        ASN1EncodableVector aSN1EncodableVectorN14 = a.n(aSN1EncodableVectorN13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        for (int i30 = 0; i30 < gMSSLeafArr3.length; i30++) {
            aSN1EncodableVector26.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i30].getStatByte();
            aSN1EncodableVector27.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector27));
            aSN1EncodableVector27 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i30].getStatInt();
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector28));
            aSN1EncodableVector28 = new ASN1EncodableVector();
            aSN1EncodableVector26 = a.n(aSN1EncodableVector26, aSN1EncodableVectorN14);
        }
        ASN1EncodableVector aSN1EncodableVectorN15 = a.n(aSN1EncodableVectorN14, aSN1EncodableVector);
        for (int i31 : iArr2) {
            aSN1EncodableVectorN15.add(new ASN1Integer(i31));
        }
        ASN1EncodableVector aSN1EncodableVectorN16 = a.n(aSN1EncodableVectorN15, aSN1EncodableVector);
        for (byte[] bArr10 : bArr6) {
            aSN1EncodableVectorN16.add(new DEROctetString(bArr10));
        }
        ASN1EncodableVector aSN1EncodableVectorN17 = a.n(aSN1EncodableVectorN16, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        int i32 = 0;
        while (i32 < gMSSRootCalcArr.length) {
            aSN1EncodableVector29.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i33 = gMSSRootCalcArr[i32].getStatInt()[0];
            int i34 = gMSSRootCalcArr[i32].getStatInt()[7];
            aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i32].getStatByte()[0]));
            int i35 = 0;
            while (i35 < i33) {
                i35++;
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i32].getStatByte()[i35]));
            }
            for (int i36 = 0; i36 < i34; i36++) {
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i32].getStatByte()[i33 + 1 + i36]));
            }
            ASN1EncodableVector aSN1EncodableVectorN18 = a.n(aSN1EncodableVector30, aSN1EncodableVector29);
            aSN1EncodableVector31.add(new ASN1Integer(i33));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[1]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[2]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[3]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[4]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[5]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[6]));
            aSN1EncodableVector31.add(new ASN1Integer(i34));
            for (int i37 = 0; i37 < i33; i37++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[i37 + 8]));
            }
            for (int i38 = 0; i38 < i34; i38++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i32].getStatInt()[i33 + 8 + i38]));
            }
            ASN1EncodableVector aSN1EncodableVectorN19 = a.n(aSN1EncodableVector31, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i32].getTreehash() != null) {
                int i39 = 0;
                while (i39 < gMSSRootCalcArr[i32].getTreehash().length) {
                    aSN1EncodableVector34.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i40 = gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[1];
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i32].getTreehash()[i39].getStatByte()[0]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i32].getTreehash()[i39].getStatByte()[1]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i32].getTreehash()[i39].getStatByte()[2]));
                    int i41 = 0;
                    while (i41 < i40) {
                        aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i32].getTreehash()[i39].getStatByte()[i41 + 3]));
                        i41++;
                        aSN1EncodableVectorN18 = aSN1EncodableVectorN18;
                    }
                    ASN1EncodableVector aSN1EncodableVector37 = aSN1EncodableVectorN18;
                    aSN1EncodableVector35 = a.n(aSN1EncodableVector35, aSN1EncodableVector34);
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[0]));
                    aSN1EncodableVector36.add(new ASN1Integer(i40));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[2]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[3]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[4]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[5]));
                    int i42 = 0;
                    while (i42 < i40) {
                        aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i32].getTreehash()[i39].getStatInt()[i42 + 6]));
                        i42++;
                        aSN1EncodableVectorN19 = aSN1EncodableVectorN19;
                    }
                    aSN1EncodableVector36 = a.n(aSN1EncodableVector36, aSN1EncodableVector34);
                    aSN1EncodableVector34 = a.n(aSN1EncodableVector34, aSN1EncodableVector32);
                    i39++;
                    aSN1EncodableVectorN18 = aSN1EncodableVector37;
                }
            }
            ASN1EncodableVector aSN1EncodableVector38 = aSN1EncodableVectorN18;
            ASN1EncodableVector aSN1EncodableVector39 = aSN1EncodableVectorN19;
            aSN1EncodableVector32 = a.n(aSN1EncodableVector32, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector40 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i32].getRetain() != null) {
                for (int i43 = 0; i43 < gMSSRootCalcArr[i32].getRetain().length; i43++) {
                    for (int i44 = 0; i44 < gMSSRootCalcArr[i32].getRetain()[i43].size(); i44++) {
                        aSN1EncodableVector40.add(new DEROctetString((byte[]) gMSSRootCalcArr[i32].getRetain()[i43].elementAt(i44)));
                    }
                    aSN1EncodableVector40 = a.n(aSN1EncodableVector40, aSN1EncodableVector33);
                }
            }
            aSN1EncodableVector33 = a.n(aSN1EncodableVector33, aSN1EncodableVector29);
            aSN1EncodableVector29 = a.n(aSN1EncodableVector29, aSN1EncodableVectorN17);
            i32++;
            aSN1EncodableVector30 = aSN1EncodableVector38;
            aSN1EncodableVector31 = aSN1EncodableVector39;
        }
        ASN1EncodableVector aSN1EncodableVectorN20 = a.n(aSN1EncodableVectorN17, aSN1EncodableVector);
        for (byte[] bArr11 : bArr7) {
            aSN1EncodableVectorN20.add(new DEROctetString(bArr11));
        }
        ASN1EncodableVector aSN1EncodableVectorN21 = a.n(aSN1EncodableVectorN20, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector42 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        for (int i45 = 0; i45 < gMSSRootSigArr.length; i45++) {
            aSN1EncodableVector41.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i45].getStatByte()[0]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i45].getStatByte()[1]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i45].getStatByte()[2]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i45].getStatByte()[3]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i45].getStatByte()[4]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new ASN1EncodableVector();
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[0]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[1]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[2]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[3]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[4]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[5]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[6]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[7]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i45].getStatInt()[8]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector43));
            aSN1EncodableVector43 = new ASN1EncodableVector();
            aSN1EncodableVector41 = a.n(aSN1EncodableVector41, aSN1EncodableVectorN21);
        }
        ASN1EncodableVector aSN1EncodableVectorN22 = a.n(aSN1EncodableVectorN21, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        for (int i46 = 0; i46 < gMSSParameters.getHeightOfTrees().length; i46++) {
            aSN1EncodableVector44.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i46]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i46]));
            aSN1EncodableVector46.add(new ASN1Integer(gMSSParameters.getK()[i46]));
        }
        aSN1EncodableVectorN22.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVectorN22.add(new DERSequence(aSN1EncodableVector44));
        aSN1EncodableVectorN22.add(new DERSequence(aSN1EncodableVector45));
        aSN1EncodableVectorN22.add(new DERSequence(aSN1EncodableVector46));
        ASN1EncodableVector aSN1EncodableVectorN23 = a.n(aSN1EncodableVectorN22, aSN1EncodableVector);
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            aSN1EncodableVectorN23.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVectorN23));
        return new DERSequence(aSN1EncodableVector);
    }

    public static GMSSPrivateKey getInstance(Object obj) {
        if (obj instanceof GMSSPrivateKey) {
            return (GMSSPrivateKey) obj;
        }
        if (obj != null) {
            return new GMSSPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
