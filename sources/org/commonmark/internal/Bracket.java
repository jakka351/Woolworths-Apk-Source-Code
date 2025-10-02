package org.commonmark.internal;

import org.commonmark.node.Text;
import org.commonmark.parser.beta.Position;

/* loaded from: classes8.dex */
public class Bracket {

    /* renamed from: a, reason: collision with root package name */
    public final Text f26820a;
    public final Position b;
    public final Text c;
    public final Position d;
    public final Position e;
    public final Bracket f;
    public final Delimiter g;
    public boolean h = true;
    public boolean i = false;

    public Bracket(Text text, Position position, Text text2, Position position2, Position position3, Bracket bracket, Delimiter delimiter) {
        this.f26820a = text;
        this.b = position;
        this.c = text2;
        this.d = position2;
        this.e = position3;
        this.f = bracket;
        this.g = delimiter;
    }
}
