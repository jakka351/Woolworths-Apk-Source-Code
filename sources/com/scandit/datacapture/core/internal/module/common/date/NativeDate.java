package com.scandit.datacapture.core.internal.module.common.date;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeDate {

    @DjinniGenerated
    public static final class CppProxy extends NativeDate {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18541a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native int native_day(long j);

        private native int native_month(long j);

        private native long native_secondsSinceEpochUInt64(long j);

        private native int native_year(long j);

        @Override // com.scandit.datacapture.core.internal.module.common.date.NativeDate
        public int day() {
            return native_day(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.common.date.NativeDate
        public int month() {
            return native_month(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.common.date.NativeDate
        public long secondsSinceEpochUInt64() {
            return native_secondsSinceEpochUInt64(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.common.date.NativeDate
        public int year() {
            return native_year(this.nativeRef);
        }
    }

    public static native NativeDate create(int i, int i2, int i3);

    public abstract int day();

    public abstract int month();

    public abstract long secondsSinceEpochUInt64();

    public abstract int year();
}
