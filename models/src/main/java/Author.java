import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class Author {
    @NotNull private String name;
    private int birthday;
}

