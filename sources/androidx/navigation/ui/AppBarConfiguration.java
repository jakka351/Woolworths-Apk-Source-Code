package androidx.navigation.ui;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration;", "", "OnNavigateUpListener", "Builder", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AppBarConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final Set f3519a;
    public final OnNavigateUpListener b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$Builder;", "", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f3520a;
        public Object b;

        public Builder() {
            HashSet hashSet = new HashSet();
            this.f3520a = hashSet;
            hashSet.addAll(EmptySet.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnNavigateUpListener {
        boolean a();
    }

    public AppBarConfiguration(HashSet hashSet, OnNavigateUpListener onNavigateUpListener) {
        this.f3519a = hashSet;
        this.b = onNavigateUpListener;
    }
}
