package hust.soict.dsai.aims;

import java.util.Comparator;
import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        return Comparator
                .comparing((Media media) -> media.getTitle().toLowerCase())
                .thenComparing(media -> -media.getCost())
                .compare(m1, m2);
    }
}
