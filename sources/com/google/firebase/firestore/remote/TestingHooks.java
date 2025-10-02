package com.google.firebase.firestore.remote;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.google.auto.value.AutoValue;
import java.util.concurrent.CopyOnWriteArrayList;

@SuppressLint
@VisibleForTesting
/* loaded from: classes6.dex */
final class TestingHooks {
    public static final TestingHooks b = new TestingHooks();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f15586a = new CopyOnWriteArrayList();

    @AutoValue
    public static abstract class ExistenceFilterBloomFilterInfo {
        public abstract boolean a();

        public abstract int b();

        public abstract BloomFilter c();

        public abstract int d();

        public abstract int e();
    }

    @AutoValue
    public static abstract class ExistenceFilterMismatchInfo {
        public abstract ExistenceFilterBloomFilterInfo a();

        public abstract String b();

        public abstract int c();

        public abstract int d();

        public abstract String e();
    }

    public interface ExistenceFilterMismatchListener {
        void a();
    }
}
