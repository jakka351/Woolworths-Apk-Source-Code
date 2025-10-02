package org.bouncycastle.asn1;

import YU.a;
import io.jsonwebtoken.JwtParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public class ASN1ObjectIdentifier extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1ObjectIdentifier.class, 6) { // from class: org.bouncycastle.asn1.ASN1ObjectIdentifier.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1ObjectIdentifier.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ConcurrentMap<OidHandle, ASN1ObjectIdentifier> pool = new ConcurrentHashMap();
    private byte[] contents;
    private final String identifier;

    public static class OidHandle {
        private final byte[] contents;
        private final int key;

        public OidHandle(byte[] bArr) {
            this.key = Arrays.hashCode(bArr);
            this.contents = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OidHandle) {
                return Arrays.areEqual(this.contents, ((OidHandle) obj).contents);
            }
            return false;
        }

        public int hashCode() {
            return this.key;
        }
    }

    public ASN1ObjectIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (!isValidIdentifier(str)) {
            throw new IllegalArgumentException(a.h("string ", str, " not an OID"));
        }
        this.identifier = str;
    }

    public static ASN1ObjectIdentifier createPrimitive(byte[] bArr, boolean z) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = pool.get(new OidHandle(bArr));
        return aSN1ObjectIdentifier == null ? new ASN1ObjectIdentifier(bArr, z) : aSN1ObjectIdentifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0048 -> B:5:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doOutput(java.io.ByteArrayOutputStream r8) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            org.bouncycastle.asn1.OIDTokenizer r0 = new org.bouncycastle.asn1.OIDTokenizer
            java.lang.String r1 = r7.identifier
            r0.<init>(r1)
            java.lang.String r1 = r0.nextToken()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.nextToken()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L27
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
        L23:
            org.bouncycastle.asn1.ASN1RelativeOID.writeField(r8, r1)
            goto L38
        L27:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            org.bouncycastle.asn1.ASN1RelativeOID.writeField(r8, r1)
        L38:
            boolean r1 = r0.hasMoreTokens()
            if (r1 == 0) goto L56
            java.lang.String r1 = r0.nextToken()
            int r2 = r1.length()
            if (r2 > r4) goto L4d
            long r1 = java.lang.Long.parseLong(r1)
            goto L23
        L4d:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            org.bouncycastle.asn1.ASN1RelativeOID.writeField(r8, r2)
            goto L38
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1ObjectIdentifier.doOutput(java.io.ByteArrayOutputStream):void");
    }

    public static ASN1ObjectIdentifier fromContents(byte[] bArr) {
        return createPrimitive(bArr, true);
    }

    private synchronized byte[] getContents() {
        try {
            if (this.contents == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                doOutput(byteArrayOutputStream);
                this.contents = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.contents;
    }

    public static ASN1ObjectIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                return (ASN1ObjectIdentifier) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1ObjectIdentifier) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.k(e, new StringBuilder("failed to construct object identifier from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.state.a.g(obj, "illegal object in getInstance: "));
    }

    private static boolean isValidIdentifier(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return ASN1RelativeOID.isValidIdentifier(str, 2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive == this) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            return this.identifier.equals(((ASN1ObjectIdentifier) aSN1Primitive).identifier);
        }
        return false;
    }

    public ASN1ObjectIdentifier branch(String str) {
        return new ASN1ObjectIdentifier(this, str);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.writeEncodingDL(z, 6, getContents());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, getContents().length);
    }

    public String getId() {
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.identifier.hashCode();
    }

    public ASN1ObjectIdentifier intern() {
        OidHandle oidHandle = new OidHandle(getContents());
        ConcurrentMap<OidHandle, ASN1ObjectIdentifier> concurrentMap = pool;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = concurrentMap.get(oidHandle);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        synchronized (concurrentMap) {
            try {
                if (concurrentMap.containsKey(oidHandle)) {
                    return concurrentMap.get(oidHandle);
                }
                concurrentMap.put(oidHandle, this);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean on(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String id = getId();
        String id2 = aSN1ObjectIdentifier.getId();
        return id.length() > id2.length() && id.charAt(id2.length()) == '.' && id.startsWith(id2);
    }

    public String toString() {
        return getId();
    }

    public ASN1ObjectIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (!ASN1RelativeOID.isValidIdentifier(str, 0)) {
            throw new IllegalArgumentException(a.h("string ", str, " not a valid OID branch"));
        }
        this.identifier = aSN1ObjectIdentifier.getId() + "." + str;
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (!z && !aSN1TaggedObject.isParsed() && 128 == aSN1TaggedObject.getTagClass()) {
            ASN1Primitive aSN1Primitive = aSN1TaggedObject.getBaseObject().toASN1Primitive();
            if (!(aSN1Primitive instanceof ASN1ObjectIdentifier)) {
                return fromContents(ASN1OctetString.getInstance(aSN1Primitive).getOctets());
            }
        }
        return (ASN1ObjectIdentifier) TYPE.getContextInstance(aSN1TaggedObject, z);
    }

    public ASN1ObjectIdentifier(byte[] bArr, boolean z) {
        boolean z2;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z3 = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= LONG_LIMIT) {
                z2 = z3;
                long j2 = j + (b & 127);
                if ((b & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    stringBuffer.append(JwtParser.SEPARATOR_CHAR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                    z3 = z2;
                }
            } else {
                z2 = z3;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b & 127));
                if ((b & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    stringBuffer.append(JwtParser.SEPARATOR_CHAR);
                    stringBuffer.append(bigIntegerOr);
                    j = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                    z3 = z2;
                }
            }
        }
        this.identifier = stringBuffer.toString();
        this.contents = z ? Arrays.clone(bArr2) : bArr2;
    }
}
