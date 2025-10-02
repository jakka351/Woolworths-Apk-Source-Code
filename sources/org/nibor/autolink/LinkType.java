package org.nibor.autolink;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class LinkType {
    public static final LinkType d;
    public static final LinkType e;
    public static final LinkType f;
    public static final /* synthetic */ LinkType[] g;

    static {
        LinkType linkType = new LinkType("URL", 0);
        d = linkType;
        LinkType linkType2 = new LinkType("EMAIL", 1);
        e = linkType2;
        LinkType linkType3 = new LinkType("WWW", 2);
        f = linkType3;
        g = new LinkType[]{linkType, linkType2, linkType3};
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) g.clone();
    }
}
