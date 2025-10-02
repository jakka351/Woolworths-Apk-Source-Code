package au.com.woolworths.android.onesite.extensions;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"au/com/woolworths/android/onesite/extensions/SharedPreferenceExtKt$delegate$1", "Lkotlin/properties/ReadWriteProperty;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SharedPreferenceExtKt$string$$inlined$delegate$1 implements ReadWriteProperty<Object, String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f4252a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public SharedPreferenceExtKt$string$$inlined$delegate$1(SharedPreferences sharedPreferences, String str, String str2) {
        this.f4252a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        String name = this.b;
        if (name == null) {
            name = property.getName();
        }
        String def = (String) this.c;
        SharedPreferences sharedPreferences = this.f4252a;
        Intrinsics.h(sharedPreferences, "<this>");
        Intrinsics.h(def, "def");
        String string = sharedPreferences.getString(name, def);
        return string == null ? def : string;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object thisRef, KProperty property, Object obj) {
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        SharedPreferences.Editor editorEdit = this.f4252a.edit();
        String name = this.b;
        if (name == null) {
            name = property.getName();
        }
        editorEdit.putString(name, (String) obj);
        editorEdit.apply();
    }
}
