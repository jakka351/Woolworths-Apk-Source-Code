package io.noties.markwon.core;

import io.noties.markwon.Prop;

/* loaded from: classes7.dex */
public abstract class CoreProps {

    /* renamed from: a, reason: collision with root package name */
    public static final Prop f24201a = new Prop("list-item-type");
    public static final Prop b = new Prop("bullet-list-item-level");
    public static final Prop c = new Prop("ordered-list-item-number");
    public static final Prop d = new Prop("heading-level");
    public static final Prop e = new Prop("link-destination");
    public static final Prop f = new Prop("paragraph-is-in-tight-list");
    public static final Prop g = new Prop("code-block-info");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ListItemType {
        public static final ListItemType d;
        public static final ListItemType e;
        public static final /* synthetic */ ListItemType[] f;

        static {
            ListItemType listItemType = new ListItemType("BULLET", 0);
            d = listItemType;
            ListItemType listItemType2 = new ListItemType("ORDERED", 1);
            e = listItemType2;
            f = new ListItemType[]{listItemType, listItemType2};
        }

        public static ListItemType valueOf(String str) {
            return (ListItemType) Enum.valueOf(ListItemType.class, str);
        }

        public static ListItemType[] values() {
            return (ListItemType[]) f.clone();
        }
    }
}
