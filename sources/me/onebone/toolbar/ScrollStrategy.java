package me.onebone.toolbar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/ScrollStrategy;", "", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ScrollStrategy {
    public static final ScrollStrategy d;
    public static final /* synthetic */ ScrollStrategy[] e;

    /* JADX INFO: Fake field, exist only in values array */
    ScrollStrategy EF0;

    static {
        ScrollStrategy scrollStrategy = new ScrollStrategy() { // from class: me.onebone.toolbar.ScrollStrategy.EnterAlways
        };
        ScrollStrategy scrollStrategy2 = new ScrollStrategy() { // from class: me.onebone.toolbar.ScrollStrategy.EnterAlwaysCollapsed
        };
        ScrollStrategy scrollStrategy3 = new ScrollStrategy() { // from class: me.onebone.toolbar.ScrollStrategy.ExitUntilCollapsed
        };
        d = scrollStrategy3;
        e = new ScrollStrategy[]{scrollStrategy, scrollStrategy2, scrollStrategy3};
    }

    public static ScrollStrategy valueOf(String str) {
        return (ScrollStrategy) Enum.valueOf(ScrollStrategy.class, str);
    }

    public static ScrollStrategy[] values() {
        return (ScrollStrategy[]) e.clone();
    }
}
