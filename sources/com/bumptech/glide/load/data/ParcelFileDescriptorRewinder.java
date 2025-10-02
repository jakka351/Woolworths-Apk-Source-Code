package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.DataRewinder;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements DataRewinder<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f13788a;

    @RequiresApi
    public static final class Factory implements DataRewinder.Factory<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final DataRewinder b(Object obj) {
            return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
        }
    }

    @RequiresApi
    /* loaded from: classes4.dex */
    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f13789a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f13789a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            ParcelFileDescriptor parcelFileDescriptor = this.f13789a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13788a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final Object a() {
        return this.f13788a.rewind();
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final void b() {
    }

    public final ParcelFileDescriptor c() {
        return this.f13788a.rewind();
    }
}
