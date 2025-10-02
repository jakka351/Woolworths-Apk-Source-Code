package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzan;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class TextRecognizer extends Detector<TextBlock> {
    private final zzan zza;

    public static class Builder {
        private Context zza;
        private zzam zzb = new zzam();

        public Builder(@RecentlyNonNull Context context) {
            this.zza = context;
        }

        @RecentlyNonNull
        public TextRecognizer build() {
            return new TextRecognizer(new zzan(this.zza, this.zzb));
        }
    }

    private TextRecognizer() {
        throw new IllegalStateException("Default constructor called");
    }

    @Override // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray<TextBlock> detect(@RecentlyNonNull Frame frame) {
        byte[] bArrArray;
        Bitmap bitmapDecodeByteArray;
        zzaj zzajVar = new zzaj(new Rect());
        if (frame == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        zzs zzsVarZza = zzs.zza(frame);
        if (frame.getBitmap() != null) {
            bitmapDecodeByteArray = frame.getBitmap();
        } else {
            Frame.Metadata metadata = frame.getMetadata();
            ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull(frame.getGrayscaleImageData());
            int format = metadata.getFormat();
            int i = zzsVarZza.zza;
            int i2 = zzsVarZza.zzb;
            if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                bArrArray = byteBuffer.array();
            } else {
                bArrArray = new byte[byteBuffer.capacity()];
                byteBuffer.get(bArrArray);
            }
            byte[] bArr = bArrArray;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new YuvImage(bArr, format, i, i2, null).compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        Bitmap bitmapZza = zzw.zza((Bitmap) Preconditions.checkNotNull(bitmapDecodeByteArray), zzsVarZza);
        if (!zzajVar.zza.isEmpty()) {
            Rect rect = zzajVar.zza;
            int width = frame.getMetadata().getWidth();
            int height = frame.getMetadata().getHeight();
            int i3 = zzsVarZza.zze;
            if (i3 == 1) {
                rect = new Rect(height - rect.bottom, rect.left, height - rect.top, rect.right);
            } else if (i3 == 2) {
                rect = new Rect(width - rect.right, height - rect.bottom, width - rect.left, height - rect.top);
            } else if (i3 == 3) {
                rect = new Rect(rect.top, width - rect.right, rect.bottom, width - rect.left);
            }
            zzajVar.zza.set(rect);
        }
        zzsVarZza.zze = 0;
        zzah[] zzahVarArrZza = this.zza.zza(bitmapZza, zzsVarZza, zzajVar);
        SparseArray sparseArray = new SparseArray();
        for (zzah zzahVar : zzahVarArrZza) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzahVar.zzf);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzahVar.zzf, sparseArray2);
            }
            sparseArray2.append(zzahVar.zzg, zzahVar);
        }
        SparseArray<TextBlock> sparseArray3 = new SparseArray<>(sparseArray.size());
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            sparseArray3.append(sparseArray.keyAt(i4), new TextBlock((SparseArray) sparseArray.valueAt(i4)));
        }
        return sparseArray3;
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.zza.zzc();
    }

    private TextRecognizer(zzan zzanVar) {
        this.zza = zzanVar;
    }
}
