package androidx.compose.ui.text.font;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "Setting", "SettingFloat", "SettingInt", "SettingTextUnit", "Settings", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FontVariation {

    @Immutable
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Setting {
        float a(Density density);
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SettingFloat implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float a(Density density) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingFloat);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=0.0)";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SettingInt implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float a(Density density) {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingInt);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=0)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class SettingTextUnit implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float a(Density density) {
            return density.getE() * TextUnit.c(0L);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SettingTextUnit) && TextUnit.a(0L, 0L);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=" + ((Object) TextUnit.e(0L)) + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static final class Settings {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2100a;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Setting setting : settingArr) {
                setting.getClass();
                Object arrayList = linkedHashMap.get(null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(null, arrayList);
                }
                ((List) arrayList).add(setting);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(b.r(a.u("'", str, "' must be unique. Actual [ ["), CollectionsKt.M(list, null, null, null, null, 63), ']').toString());
                }
                CollectionsKt.h(list, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f2100a = arrayList3;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ((Setting) arrayList3.get(i)).getClass();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Settings) {
                return Intrinsics.c(this.f2100a, ((Settings) obj).f2100a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2100a.hashCode();
        }
    }
}
