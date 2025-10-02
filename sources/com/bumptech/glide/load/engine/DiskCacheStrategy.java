package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes.dex */
public abstract class DiskCacheStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final DiskCacheStrategy f13803a = new AnonymousClass1();
    public static final DiskCacheStrategy b = new AnonymousClass2();
    public static final DiskCacheStrategy c = new AnonymousClass3();
    public static final DiskCacheStrategy d = new AnonymousClass5();

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$1, reason: invalid class name */
    public class AnonymousClass1 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.e;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.g || dataSource == DataSource.h) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$2, reason: invalid class name */
    public class AnonymousClass2 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$3, reason: invalid class name */
    public class AnonymousClass3 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return (dataSource == DataSource.f || dataSource == DataSource.h) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$4, reason: invalid class name */
    public class AnonymousClass4 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.g || dataSource == DataSource.h) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$5, reason: invalid class name */
    public class AnonymousClass5 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.e;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.f) || dataSource == DataSource.d) && encodeStrategy == EncodeStrategy.e;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
