package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CaptureConfig {
    public static final Config.Option i = new AutoValue_Config_Option(Integer.TYPE, null, "camerax.core.captureConfig.rotation");
    public static final Config.Option j = new AutoValue_Config_Option(Integer.class, null, "camerax.core.captureConfig.jpegQuality");
    public static final Config.Option k = new AutoValue_Config_Option(Range.class, null, "camerax.core.captureConfig.resolvedFrameRate");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f482a;
    public final OptionsBundle b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final TagBundle g;
    public final CameraCaptureResult h;

    public interface OptionUnpacker {
        void a(UseCaseConfig useCaseConfig, Builder builder);
    }

    public CaptureConfig(ArrayList arrayList, OptionsBundle optionsBundle, int i2, boolean z, ArrayList arrayList2, boolean z2, TagBundle tagBundle, CameraCaptureResult cameraCaptureResult) {
        this.f482a = arrayList;
        this.b = optionsBundle;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = tagBundle;
        this.h = cameraCaptureResult;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.f504a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Object objA = 0;
        try {
            objA = this.b.a(UseCaseConfig.A);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objA;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Object objA = 0;
        try {
            objA = this.b.a(UseCaseConfig.B);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objA;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f483a;
        public MutableOptionsBundle b;
        public int c;
        public final boolean d;
        public final ArrayList e;
        public boolean f;
        public final MutableTagBundle g;
        public CameraCaptureResult h;

        public Builder() {
            this.f483a = new HashSet();
            this.b = MutableOptionsBundle.V();
            this.c = -1;
            this.d = false;
            this.e = new ArrayList();
            this.f = false;
            this.g = new MutableTagBundle(new ArrayMap());
        }

        public final void a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b((CameraCaptureCallback) it.next());
            }
        }

        public final void b(CameraCaptureCallback cameraCaptureCallback) {
            ArrayList arrayList = this.e;
            if (arrayList.contains(cameraCaptureCallback)) {
                return;
            }
            arrayList.add(cameraCaptureCallback);
        }

        public final void c(Config config) {
            Object objA;
            for (Config.Option option : config.f()) {
                MutableOptionsBundle mutableOptionsBundle = this.b;
                mutableOptionsBundle.getClass();
                try {
                    objA = mutableOptionsBundle.a(option);
                } catch (IllegalArgumentException unused) {
                    objA = null;
                }
                Object objA2 = config.a(option);
                if (objA instanceof MultiValueSet) {
                    ((MultiValueSet) objA2).getClass();
                    Collections.unmodifiableList(new ArrayList((Collection) null));
                    throw null;
                }
                if (objA2 instanceof MultiValueSet) {
                    objA2 = ((MultiValueSet) objA2).clone();
                }
                this.b.X(option, config.h(option), objA2);
            }
        }

        public final CaptureConfig d() {
            ArrayList arrayList = new ArrayList(this.f483a);
            OptionsBundle optionsBundleU = OptionsBundle.U(this.b);
            int i = this.c;
            ArrayList arrayList2 = new ArrayList(this.e);
            boolean z = this.f;
            TagBundle tagBundle = TagBundle.b;
            ArrayMap arrayMap = new ArrayMap();
            MutableTagBundle mutableTagBundle = this.g;
            for (String str : mutableTagBundle.f504a.keySet()) {
                arrayMap.put(str, mutableTagBundle.f504a.get(str));
            }
            return new CaptureConfig(arrayList, optionsBundleU, i, this.d, arrayList2, z, new TagBundle(arrayMap), this.h);
        }

        public Builder(CaptureConfig captureConfig) {
            HashSet hashSet = new HashSet();
            this.f483a = hashSet;
            this.b = MutableOptionsBundle.V();
            this.c = -1;
            this.d = false;
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.f = false;
            this.g = new MutableTagBundle(new ArrayMap());
            hashSet.addAll(captureConfig.f482a);
            this.b = MutableOptionsBundle.W(captureConfig.b);
            this.c = captureConfig.c;
            arrayList.addAll(captureConfig.e);
            this.f = captureConfig.f;
            TagBundle tagBundle = captureConfig.g;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : tagBundle.f504a.keySet()) {
                arrayMap.put(str, tagBundle.f504a.get(str));
            }
            this.g = new MutableTagBundle(arrayMap);
            this.d = captureConfig.d;
        }
    }
}
