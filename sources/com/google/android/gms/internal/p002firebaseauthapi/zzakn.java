package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class zzakn extends zzajw {
    private static final Logger zzb = Logger.getLogger(zzakn.class.getName());
    private static final boolean zzc = zzanz.zzc();
    zzakp zza;

    public static class zza extends zzakn {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(b.i(bArr.length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(int i, boolean z) throws IOException {
            zzj(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzd(int i, zzajv zzajvVar) throws IOException {
            zzj(1, 3);
            zzk(2, i);
            zzc(3, zzajvVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzf(int i, long j) throws IOException {
            zzj(i, 1);
            zzf(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzg(int i, int i2) throws IOException {
            zzj(i, 5);
            zzj(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzh(int i, int i2) throws IOException {
            zzj(i, 0);
            zzk(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzj(int i) throws IOException {
            int i2 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                bArr[i2 + 3] = i >> 24;
                this.zzd = i2 + 4;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(i2, this.zzc, 4, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzk(int i) throws IOException {
            if (i >= 0) {
                zzm(i);
            } else {
                zzh(i);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzm(int i) throws IOException {
            int i2;
            int i3 = this.zzd;
            while ((i & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    throw new zzd(i3, this.zzc, 1, (Throwable) e);
                }
                try {
                    this.zzb[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    throw new zzd(i3, this.zzc, 1, (Throwable) e);
                }
            }
            i2 = i3 + 1;
            this.zzb[i3] = (byte) i;
            this.zzd = i2;
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zzd, i2);
                this.zzd += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(this.zzd, this.zzc, i2, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zza(byte b) throws IOException {
            int i;
            int i2 = this.zzd;
            try {
                i = i2 + 1;
            } catch (IndexOutOfBoundsException e) {
                e = e;
            }
            try {
                this.zzb[i2] = b;
                this.zzd = i;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i2 = i;
                throw new zzd(i2, this.zzc, 1, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzm(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzf(long j) throws IOException {
            int i = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                bArr[i + 7] = (byte) (j >> 56);
                this.zzd = i + 8;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(i, this.zzc, 8, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzh(int i, long j) throws IOException {
            zzj(i, 0);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzk(int i, int i2) throws IOException {
            zzj(i, 0);
            zzm(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(zzajv zzajvVar) throws IOException {
            zzm(zzajvVar.zzb());
            zzajvVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzc(int i, zzajv zzajvVar) throws IOException {
            zzj(i, 2);
            zzb(zzajvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzh(long j) throws IOException {
            int i;
            int i2 = this.zzd;
            if (zzakn.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    zzanz.zza(this.zzb, i2, (byte) (((int) j) | 128));
                    j >>>= 7;
                    i2++;
                }
                i = i2 + 1;
                zzanz.zza(this.zzb, i2, (byte) j);
            } else {
                while ((j & (-128)) != 0) {
                    try {
                        int i3 = i2 + 1;
                        try {
                            this.zzb[i2] = (byte) (((int) j) | 128);
                            j >>>= 7;
                            i2 = i3;
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                            i2 = i3;
                            throw new zzd(i2, this.zzc, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                    }
                }
                i = i2 + 1;
                try {
                    this.zzb[i2] = (byte) j;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i2 = i;
                    throw new zzd(i2, this.zzc, 1, (Throwable) e);
                }
            }
            this.zzd = i;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(zzamm zzammVar) throws IOException {
            zzm(zzammVar.zzl());
            zzammVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzj(int i, int i2) throws IOException {
            zzm((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(int i, zzamm zzammVar) throws IOException {
            zzj(1, 3);
            zzk(2, i);
            zzj(3, 2);
            zzb(zzammVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(int i, String str) throws IOException {
            zzj(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(String str) throws IOException {
            int i = this.zzd;
            try {
                int iZzi = zzakn.zzi(str.length() * 3);
                int iZzi2 = zzakn.zzi(str.length());
                if (iZzi2 == iZzi) {
                    int i2 = i + iZzi2;
                    this.zzd = i2;
                    int iZza = zzaoa.zza(str, this.zzb, i2, zza());
                    this.zzd = i;
                    zzm((iZza - i) - iZzi2);
                    this.zzd = iZza;
                    return;
                }
                zzm(zzaoa.zza(str));
                this.zzd = zzaoa.zza(str, this.zzb, this.zzd, zza());
            } catch (zzaod e) {
                this.zzd = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzd(e2);
            }
        }
    }

    public static abstract class zzb extends zzakn {
        final byte[] zzb;
        final int zzc;
        int zzd;
        int zze;

        public zzb(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.zzb = bArr;
            this.zzc = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(byte b) {
            int i = this.zzd;
            this.zzb[i] = b;
            this.zzd = i + 1;
            this.zze++;
        }

        public final void zzi(long j) {
            int i = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzd = i + 8;
            this.zze += 8;
        }

        public final void zzj(long j) {
            if (!zzakn.zzc) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    bArr[i] = (byte) (((int) j) | 128);
                    this.zze++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr2[i2] = (byte) j;
                this.zze++;
                return;
            }
            long j2 = this.zzd;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                zzanz.zza(bArr3, i3, (byte) (((int) j) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            zzanz.zza(bArr4, i4, (byte) j);
            this.zze += (int) (this.zzd - j2);
        }

        public final void zzl(int i, int i2) {
            zzo((i << 3) | i2);
        }

        public final void zzn(int i) {
            int i2 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = i >> 24;
            this.zzd = i2 + 4;
            this.zze += 4;
        }

        public final void zzo(int i) {
            if (!zzakn.zzc) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    this.zze++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr2[i3] = (byte) i;
                this.zze++;
                return;
            }
            long j = this.zzd;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                zzanz.zza(bArr3, i4, (byte) (i | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            zzanz.zza(bArr4, i5, (byte) i);
            this.zze += (int) (this.zzd - j);
        }
    }

    public static class zzd extends IOException {
        public zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzd(String str, Throwable th) {
            super(a.A("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzd(int i, int i2, int i3, Throwable th) {
            this(i, i2, i3, th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private zzd(long j, long j2, int i, Throwable th) {
            Locale locale = Locale.US;
            StringBuilder sbT = b.t(j, "Pos: ", ", limit: ");
            sbT.append(j2);
            sbT.append(", len: ");
            sbT.append(i);
            this(sbT.toString(), th);
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i) {
        return 4;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zze(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzf(int i) {
        return 4;
    }

    public static int zzg(int i) {
        return zzi(zzn(i));
    }

    public static int zzh(int i) {
        return zzi(i << 3);
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private static int zzn(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zzb(int i, zzamm zzammVar) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzajv zzajvVar) throws IOException;

    public abstract void zzb(zzamm zzammVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i, zzajv zzajvVar) throws IOException;

    public abstract void zzd(int i, zzajv zzajvVar) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzf(long j) throws IOException;

    public abstract void zzg(int i, int i2) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzh(long j) throws IOException;

    public abstract void zzj(int i) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzk(int i, int i2) throws IOException;

    public final void zzl(int i) throws IOException {
        zzm(zzn(i));
    }

    public abstract void zzm(int i) throws IOException;

    public static final class zzc extends zzb {
        private final OutputStream zzf;

        public zzc(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        private final void zzp(int i) throws IOException {
            if (this.zzc - this.zzd < i) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zza(byte b) throws IOException {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(int i, boolean z) throws IOException {
            zzp(11);
            zzl(i, 0);
            zzb(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzc() throws IOException {
            if (this.zzd > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzd(int i, zzajv zzajvVar) throws IOException {
            zzj(1, 3);
            zzk(2, i);
            zzc(3, zzajvVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzf(int i, long j) throws IOException {
            zzp(18);
            zzl(i, 1);
            zzi(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzg(int i, int i2) throws IOException {
            zzp(14);
            zzl(i, 5);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzh(int i, int i2) throws IOException {
            zzp(20);
            zzl(i, 0);
            if (i2 >= 0) {
                zzo(i2);
            } else {
                zzj(i2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzj(int i) throws IOException {
            zzp(4);
            zzn(i);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzk(int i) throws IOException {
            if (i >= 0) {
                zzm(i);
            } else {
                zzh(i);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzm(int i) throws IOException {
            zzp(5);
            zzo(i);
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.zzc;
            int i4 = this.zzd;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.zzb, i4, i2);
                this.zzd += i2;
            } else {
                int i5 = i3 - i4;
                System.arraycopy(bArr, i, this.zzb, i4, i5);
                int i6 = i + i5;
                i2 -= i5;
                this.zzd = this.zzc;
                this.zze += i5;
                zze();
                if (i2 <= this.zzc) {
                    System.arraycopy(bArr, i6, this.zzb, 0, i2);
                    this.zzd = i2;
                } else {
                    this.zzf.write(bArr, i6, i2);
                }
            }
            this.zze += i2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzj(int i, int i2) throws IOException {
            zzm((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzk(int i, int i2) throws IOException {
            zzp(20);
            zzl(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzm(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzf(long j) throws IOException {
            zzp(8);
            zzi(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzh(int i, long j) throws IOException {
            zzp(20);
            zzl(i, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(zzajv zzajvVar) throws IOException {
            zzm(zzajvVar.zzb());
            zzajvVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(zzamm zzammVar) throws IOException {
            zzm(zzammVar.zzl());
            zzammVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzh(long j) throws IOException {
            zzp(10);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(int i, zzamm zzammVar) throws IOException {
            zzj(1, 3);
            zzk(2, i);
            zzj(3, 2);
            zzb(zzammVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(int i, String str) throws IOException {
            zzj(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzc(int i, zzajv zzajvVar) throws IOException {
            zzj(i, 2);
            zzb(zzajvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzi = zzakn.zzi(length);
                int i = iZzi + length;
                int i2 = this.zzc;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzaoa.zza(str, bArr, 0, length);
                    zzm(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i > i2 - this.zzd) {
                    zze();
                }
                int iZzi2 = zzakn.zzi(str.length());
                int i3 = this.zzd;
                try {
                    if (iZzi2 == iZzi) {
                        int i4 = i3 + iZzi2;
                        this.zzd = i4;
                        int iZza3 = zzaoa.zza(str, this.zzb, i4, this.zzc - i4);
                        this.zzd = i3;
                        iZza = (iZza3 - i3) - iZzi2;
                        zzo(iZza);
                        this.zzd = iZza3;
                    } else {
                        iZza = zzaoa.zza(str);
                        zzo(iZza);
                        this.zzd = zzaoa.zza(str, this.zzb, this.zzd, iZza);
                    }
                    this.zze += iZza;
                } catch (zzaod e) {
                    this.zze -= this.zzd - i3;
                    this.zzd = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzd(e2);
                }
            } catch (zzaod e3) {
                zza(str, e3);
            }
        }
    }

    private zzakn() {
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zzb(int i, int i2) {
        return zzi(i << 3) + 4;
    }

    public static int zzc(int i, int i2) {
        return zze(i2) + zzi(i << 3);
    }

    public static int zzd(int i) {
        return zzi(i) + i;
    }

    public static int zze(int i, int i2) {
        return zzi(zzn(i2)) + zzi(i << 3);
    }

    public static int zzf(int i, int i2) {
        return zzi(i2) + zzi(i << 3);
    }

    public static int zzi(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzg(int i, long j) throws IOException {
        zzh(i, zzi(j));
    }

    public static int zza(long j) {
        return 8;
    }

    public static int zzb(int i, long j) {
        return zze(j) + zzi(i << 3);
    }

    public static int zzd(int i, int i2) {
        return zzi(i << 3) + 4;
    }

    public final void zzg(long j) throws IOException {
        zzh(zzi(j));
    }

    public final void zzi(int i, int i2) throws IOException {
        zzk(i, zzn(i2));
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zzc(int i) {
        return zze(i);
    }

    public static int zzd(int i, long j) {
        return zze(zzi(j)) + zzi(i << 3);
    }

    public static int zze(int i, long j) {
        return zze(j) + zzi(i << 3);
    }

    public static int zza(int i, boolean z) {
        return zzi(i << 3) + 1;
    }

    public static int zzb(long j) {
        return zze(j);
    }

    public static int zzc(int i, long j) {
        return zzi(i << 3) + 8;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzi(length) + length;
    }

    public static int zzb(int i, zzalu zzaluVar) {
        int iZzi = zzi(i << 3);
        int iZza = zzaluVar.zza();
        return zzi(iZza) + iZza + iZzi;
    }

    public static int zzd(long j) {
        return zze(zzi(j));
    }

    public static int zze(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zza(int i, zzajv zzajvVar) {
        int iZzi = zzi(i << 3);
        int iZzb = zzajvVar.zzb();
        return zzi(iZzb) + iZzb + iZzi;
    }

    public static int zzb(int i, zzajv zzajvVar) {
        return zza(3, zzajvVar) + zzf(2, i) + (zzi(8) << 1);
    }

    public static int zza(zzajv zzajvVar) {
        int iZzb = zzajvVar.zzb();
        return zzi(iZzb) + iZzb;
    }

    public static zzakn zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zza(int i, double d) {
        return zzi(i << 3) + 8;
    }

    public static int zza(int i, int i2) {
        return zze(i2) + zzi(i << 3);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int zza(int i) {
        return zze(i);
    }

    public final void zzb(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i, long j) {
        return zzi(i << 3) + 8;
    }

    public final void zzb(int i, double d) throws IOException {
        zzf(i, Double.doubleToRawLongBits(d));
    }

    public static int zza(int i, float f) {
        return zzi(i << 3) + 4;
    }

    public final void zzb(double d) throws IOException {
        zzf(Double.doubleToRawLongBits(d));
    }

    public static int zza(int i, zzalu zzaluVar) {
        return zzb(3, zzaluVar) + zzf(2, i) + (zzi(8) << 1);
    }

    public final void zzb(int i, float f) throws IOException {
        zzg(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) throws IOException {
        zzj(Float.floatToRawIntBits(f));
    }

    public static int zza(zzalu zzaluVar) {
        int iZza = zzaluVar.zza();
        return zzi(iZza) + iZza;
    }

    public static int zza(int i, zzamm zzammVar) {
        return zza(zzammVar) + zzi(24) + zzf(2, i) + (zzi(8) << 1);
    }

    public static int zza(zzamm zzammVar) {
        int iZzl = zzammVar.zzl();
        return zzi(iZzl) + iZzl;
    }

    public static int zza(int i, String str) {
        return zza(str) + zzi(i << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzaoa.zza(str);
        } catch (zzaod unused) {
            length = str.getBytes(zzalh.zza).length;
        }
        return zzi(length) + length;
    }

    public static zzakn zza(OutputStream outputStream, int i) {
        return new zzc(outputStream, i);
    }

    public final void zza(String str, zzaod zzaodVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaodVar);
        byte[] bytes = str.getBytes(zzalh.zza);
        try {
            zzm(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzd(e);
        }
    }
}
