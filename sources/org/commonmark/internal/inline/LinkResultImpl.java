package org.commonmark.internal.inline;

import org.commonmark.node.Node;
import org.commonmark.parser.beta.LinkResult;
import org.commonmark.parser.beta.Position;

/* loaded from: classes8.dex */
public class LinkResultImpl implements LinkResult {

    /* renamed from: a, reason: collision with root package name */
    public final Node f26850a;
    public final Position b;
    public boolean c = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] d = {new Type("WRAP", 0), new Type("REPLACE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }
    }

    public LinkResultImpl(Node node, Position position) {
        this.f26850a = node;
        this.b = position;
    }
}
