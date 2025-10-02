package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;

/* loaded from: classes4.dex */
public class UnitModelLoader<Model> implements ModelLoader<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    public static final UnitModelLoader f13878a = new UnitModelLoader();

    /* loaded from: classes.dex */
    public static class Factory<Model> implements ModelLoaderFactory<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        public static final Factory f13879a = new Factory();

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return UnitModelLoader.f13878a;
        }
    }

    public static class UnitFetcher<Model> implements DataFetcher<Model> {
        public final Object d;

        public UnitFetcher(Object obj) {
            this.d = obj;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.d.getClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource c() {
            return DataSource.d;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void d(Priority priority, DataFetcher.DataCallback dataCallback) {
            dataCallback.e(this.d);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        return new ModelLoader.LoadData(new ObjectKey(obj), new UnitFetcher(obj));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        return true;
    }
}
