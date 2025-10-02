package androidx.compose.ui.text.intl;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {

    /* renamed from: a, reason: collision with root package name */
    public android.os.LocaleList f2135a;
    public LocaleList b;
    public final SynchronizedObject c = new SynchronizedObject();

    public final LocaleList a() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.c) {
            LocaleList localeList2 = this.b;
            if (localeList2 != null && localeList == this.f2135a) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new Locale(localeList.get(i)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.f2135a = localeList;
            this.b = localeList3;
            return localeList3;
        }
    }
}
