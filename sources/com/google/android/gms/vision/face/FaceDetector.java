package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zzb;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.zzc;
import java.nio.ByteBuffer;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes5.dex */
public final class FaceDetector extends Detector<Face> {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;
    private final zzc zza;

    @GuardedBy
    private final zzb zzb;
    private final Object zzc;

    @GuardedBy
    private boolean zzd;

    public static class Builder {
        private final Context zza;
        private int zzb = 0;
        private boolean zzc = false;
        private int zzd = 0;
        private boolean zze = true;
        private int zzf = 0;
        private float zzg = -1.0f;

        public Builder(@RecentlyNonNull Context context) {
            this.zza = context;
        }

        @RecentlyNonNull
        public FaceDetector build() {
            zzf zzfVar = new zzf();
            zzfVar.zza = this.zzf;
            zzfVar.zzb = this.zzb;
            zzfVar.zzc = this.zzd;
            zzfVar.zzd = this.zzc;
            zzfVar.zze = this.zze;
            zzfVar.zzf = this.zzg;
            if (FaceDetector.zzb(zzfVar)) {
                return new FaceDetector(new zzb(this.zza, zzfVar));
            }
            throw new IllegalArgumentException("Invalid build options");
        }

        @RecentlyNonNull
        public Builder setClassificationType(int i) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException(c.k(40, i, "Invalid classification type: "));
            }
            this.zzd = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setLandmarkType(int i) {
            if (i != 0 && i != 1 && i != 2) {
                throw new IllegalArgumentException(c.k(34, i, "Invalid landmark type: "));
            }
            this.zzb = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setMinFaceSize(float f) {
            if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
                this.zzg = f;
                return this;
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid proportional face size: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder setMode(int i) {
            if (i != 0 && i != 1 && i != 2) {
                throw new IllegalArgumentException(c.k(25, i, "Invalid mode: "));
            }
            this.zzf = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setProminentFaceOnly(boolean z) {
            this.zzc = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setTrackingEnabled(boolean z) {
            this.zze = z;
            return this;
        }
    }

    private FaceDetector() {
        this.zza = new zzc();
        this.zzc = new Object();
        this.zzd = true;
        throw new IllegalStateException("Default constructor called");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(zzf zzfVar) {
        boolean z;
        if (zzfVar.zza == 2 || zzfVar.zzb != 2) {
            z = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (zzfVar.zzb != 2 || zzfVar.zzc != 1) {
            return z;
        }
        Log.e("FaceDetector", "Classification is not supported with contour.");
        return false;
    }

    @Override // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray<Face> detect(@RecentlyNonNull Frame frame) {
        Face[] faceArrZza;
        if (frame == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        if (frame.getPlanes() == null || ((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes())).length != 3) {
            ByteBuffer byteBufferZza = frame.getBitmap() != null ? zzw.zza((Bitmap) Preconditions.checkNotNull(frame.getBitmap()), true) : frame.getGrayscaleImageData();
            synchronized (this.zzc) {
                if (!this.zzd) {
                    throw new IllegalStateException("Cannot use detector after release()");
                }
                faceArrZza = this.zzb.zza((ByteBuffer) Preconditions.checkNotNull(byteBufferZza), zzs.zza(frame));
            }
        } else {
            synchronized (this.zzc) {
                try {
                    if (!this.zzd) {
                        throw new IllegalStateException("Cannot use detector after release()");
                    }
                    faceArrZza = this.zzb.zza((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes()), zzs.zza(frame));
                } finally {
                }
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray<Face> sparseArray = new SparseArray<>(faceArrZza.length);
        int iMax = 0;
        for (Face face : faceArrZza) {
            int id = face.getId();
            iMax = Math.max(iMax, id);
            if (hashSet.contains(Integer.valueOf(id))) {
                id = iMax + 1;
                iMax = id;
            }
            hashSet.add(Integer.valueOf(id));
            sparseArray.append(this.zza.zza(id), face);
        }
        return sparseArray;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this.zzc) {
                try {
                    if (this.zzd) {
                        Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                        release();
                    }
                } finally {
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        synchronized (this.zzc) {
            try {
                if (this.zzd) {
                    this.zzb.zzc();
                    this.zzd = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean setFocus(int i) {
        boolean zZza;
        int iZzb = this.zza.zzb(i);
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    throw new RuntimeException("Cannot use detector after release()");
                }
                zZza = this.zzb.zza(iZzb);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zZza;
    }

    private FaceDetector(zzb zzbVar) {
        this.zza = new zzc();
        this.zzc = new Object();
        this.zzd = true;
        this.zzb = zzbVar;
    }
}
