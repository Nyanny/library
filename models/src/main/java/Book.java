import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Getter
@Setter
public class Book {
    @NotNull private String bookTitle;
    @Nullable private Author author;
    private int pagesCount;
    private int publishedDate;
}
