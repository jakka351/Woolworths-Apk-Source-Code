package org.commonmark.internal;

import java.util.ArrayList;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.LinkReferenceDefinition;

/* loaded from: classes8.dex */
public class LinkReferenceDefinitionParser {
    public StringBuilder e;
    public String f;
    public char g;
    public StringBuilder h;

    /* renamed from: a, reason: collision with root package name */
    public State f26837a = State.d;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final /* synthetic */ State[] j;

        static {
            State state = new State("START_DEFINITION", 0);
            d = state;
            State state2 = new State("LABEL", 1);
            e = state2;
            State state3 = new State("DESTINATION", 2);
            f = state3;
            State state4 = new State("START_TITLE", 3);
            g = state4;
            State state5 = new State("TITLE", 4);
            h = state5;
            State state6 = new State("PARAGRAPH", 5);
            i = state6;
            j = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) j.clone();
        }
    }

    public final void a() {
        if (this.i) {
            String strB = Escaping.b(this.f);
            StringBuilder sb = this.h;
            String strB2 = sb != null ? Escaping.b(sb.toString()) : null;
            String string = this.e.toString();
            LinkReferenceDefinition linkReferenceDefinition = new LinkReferenceDefinition();
            linkReferenceDefinition.g = string;
            linkReferenceDefinition.h = strB;
            linkReferenceDefinition.i = strB2;
            ArrayList arrayList = this.d;
            linkReferenceDefinition.h(arrayList);
            arrayList.clear();
            this.c.add(linkReferenceDefinition);
            this.e = null;
            this.i = false;
            this.f = null;
            this.h = null;
        }
    }
}
