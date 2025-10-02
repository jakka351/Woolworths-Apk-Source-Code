package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbv extends zzbn {
    static final zzbn zza = new zzbv(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbv(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    public static zzbv zzg(int i, Object[] objArr, zzbm zzbmVar) {
        boolean z;
        int i2;
        int i3;
        short[] sArr;
        boolean z2;
        byte[] bArr;
        boolean z3;
        ?? r16;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzbv) zza;
        }
        Object obj = null;
        boolean z4 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzbf.zza(obj2, obj3);
            return new zzbv(null, objArrCopyOf, 1);
        }
        zzbc.zzb(i4, objArrCopyOf.length >> 1, "index");
        int iZzf = zzbo.zzf(i4);
        if (i4 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzbf.zza(obj4, obj5);
            r16 = 0;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = iZzf - 1;
            if (iZzf <= 128) {
                byte[] bArr2 = new byte[iZzf];
                Arrays.fill(bArr2, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj6 = objArrCopyOf[i10];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i10 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzbf.zza(obj6, obj7);
                    int iZza = zzbg.zza(obj6.hashCode());
                    while (true) {
                        int i11 = iZza & i6;
                        z3 = z4;
                        int i12 = bArr2[i11] & 255;
                        if (i12 == 255) {
                            bArr2[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj6;
                                objArrCopyOf[i9 ^ 1] = obj7;
                            }
                            i8++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj8 = objArrCopyOf[i13];
                                Objects.requireNonNull(obj8);
                                zzbl zzblVar = new zzbl(obj6, obj7, obj8);
                                objArrCopyOf[i13] = obj7;
                                obj = zzblVar;
                                break;
                            }
                            iZza = i11 + 1;
                            z4 = z3;
                        }
                    }
                    i7++;
                    z4 = z3;
                }
                z = z4;
                bArr = bArr2;
                z2 = z;
                if (i8 != i4) {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr2;
                    sArr[1] = Integer.valueOf(i8);
                    sArr[2] = obj;
                    obj = sArr;
                    i2 = 1;
                    r16 = z;
                }
                i2 = 1;
                obj = bArr;
                r16 = z2;
            } else {
                z = false;
                if (iZzf <= 32768) {
                    sArr = new short[iZzf];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj9 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbf.zza(obj9, obj10);
                        int iZza2 = zzbg.zza(obj9.hashCode());
                        while (true) {
                            int i18 = iZza2 & i6;
                            char c = (char) sArr[i18];
                            if (c == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj9;
                                    objArrCopyOf[i16 ^ 1] = obj10;
                                }
                                i14++;
                            } else {
                                if (obj9.equals(objArrCopyOf[c])) {
                                    int i19 = c ^ 1;
                                    Object obj11 = objArrCopyOf[i19];
                                    Objects.requireNonNull(obj11);
                                    zzbl zzblVar2 = new zzbl(obj9, obj10, obj11);
                                    objArrCopyOf[i19] = obj10;
                                    obj = zzblVar2;
                                    break;
                                }
                                iZza2 = i18 + 1;
                            }
                        }
                    }
                    if (i14 != i4) {
                        bArr = new Object[]{sArr, Integer.valueOf(i14), obj};
                        z2 = z;
                        i2 = 1;
                        obj = bArr;
                        r16 = z2;
                    }
                    obj = sArr;
                    i2 = 1;
                    r16 = z;
                } else {
                    int[] iArr = new int[iZzf];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj12 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i23 ^ i5];
                        Objects.requireNonNull(obj13);
                        zzbf.zza(obj12, obj13);
                        int iZza3 = zzbg.zza(obj12.hashCode());
                        while (true) {
                            int i24 = iZza3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj12;
                                    objArrCopyOf[i22 ^ 1] = obj13;
                                }
                                i21++;
                                i3 = i5;
                            } else {
                                i3 = i5;
                                if (obj12.equals(objArrCopyOf[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj14 = objArrCopyOf[i26];
                                    Objects.requireNonNull(obj14);
                                    zzbl zzblVar3 = new zzbl(obj12, obj13, obj14);
                                    objArrCopyOf[i26] = obj13;
                                    obj = zzblVar3;
                                    break;
                                }
                                iZza3 = i24 + 1;
                                i5 = i3;
                            }
                        }
                        i20++;
                        i5 = i3;
                    }
                    i2 = i5;
                    if (i21 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i2] = Integer.valueOf(i21);
                        objArr2[2] = obj;
                        obj = objArr2;
                        r16 = z;
                    }
                }
            }
        }
        boolean z5 = obj instanceof Object[];
        Object obj15 = obj;
        if (z5) {
            Object[] objArr3 = (Object[]) obj;
            zzbmVar.zzc = (zzbl) objArr3[2];
            Object obj16 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i4 = iIntValue;
        }
        return new zzbv(obj15, objArrCopyOf, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.maps.zzbn, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.maps.zzbg.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.maps.zzbg.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.maps.zzbg.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzbv.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbh zza() {
        return new zzbu(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zzd() {
        return new zzbs(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zze() {
        return new zzbt(this, new zzbu(this.zzb, 0, this.zzd));
    }
}
