package au.com.woolworths.android.onesite.extensions;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"au/com/woolworths/android/onesite/extensions/SharedPreferenceExtKt$delegate$1", "Lkotlin/properties/ReadWriteProperty;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SharedPreferenceExtKt$int$$inlined$delegate$1 implements ReadWriteProperty<Object, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f4250a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Integer c;

    public SharedPreferenceExtKt$int$$inlined$delegate$1(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f4250a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.h(property, "property");
        return Integer.valueOf(this.f4250a.getInt(this.b, this.c.intValue()));
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty property, Object obj2) {
        Intrinsics.h(property, "property");
        SharedPreferences.Editor editorEdit = this.f4250a.edit();
        editorEdit.putInt(this.b, ((Number) obj2).intValue());
        editorEdit.apply();
    }
}
