package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.os.SavedStateReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "SavingStateLiveData", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SavedStateHandle {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2795a;
    public final SavedStateHandleImpl b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static SavedStateHandle a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.e(classLoader);
            bundle.setClassLoader(classLoader);
            return new SavedStateHandle(SavedStateReader.n(bundle));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/MutableLiveData;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
    }

    public SavedStateHandle(MapBuilder mapBuilder) {
        this.f2795a = new LinkedHashMap();
        this.b = new SavedStateHandleImpl(mapBuilder);
    }

    public final Object a(String str) {
        Object value;
        SavedStateHandleImpl savedStateHandleImpl = this.b;
        savedStateHandleImpl.getClass();
        LinkedHashMap linkedHashMap = savedStateHandleImpl.f2809a;
        LinkedHashMap linkedHashMap2 = savedStateHandleImpl.d;
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) linkedHashMap2.get(str);
            if (mutableStateFlow != null && (value = mutableStateFlow.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            savedStateHandleImpl.c.remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(Object obj, String str) {
        if (!SavedStateHandleImpl_androidKt.a(obj)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            Intrinsics.e(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        Object obj2 = this.f2795a.get(str);
        MutableLiveData mutableLiveData = obj2 instanceof MutableLiveData ? (MutableLiveData) obj2 : null;
        if (mutableLiveData != null) {
            mutableLiveData.m(obj);
        }
        this.b.a(obj, str);
    }

    public SavedStateHandle() {
        this.f2795a = new LinkedHashMap();
        this.b = new SavedStateHandleImpl(EmptyMap.d);
    }
}
