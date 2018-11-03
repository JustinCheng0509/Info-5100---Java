import java.util.*;
public class merge {
    public List<Interval> merge(List<Interval> intervals) {

        if (intervals.size() <= 1)
            return intervals;

        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                if (o1.start == o2.start)
                    return o1.end - o2.end;
                else
                    return o1.start - o2.start;
            }
        });

        List<Interval> res = new ArrayList<>(); // Result list.
        Interval prev = intervals.get(0), cur; // Prev is always the one for the next interval to compare.

        for (int i = 1; i < intervals.size(); i++) {
            cur = intervals.get(i);
            if (prev.end >= cur.start) { // Overlapped case.
                prev = new Interval(prev.start, Math.max(prev.end, cur.end));
            } else {
                res.add(prev);
                prev = cur;
            }
        }
        res.add(prev); // The last one to add to the result list.

        return res;
    }
}
class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
