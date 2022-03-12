package lombok;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Builder
public class Car {
    String name;
    String factory;
    Integer countOfWheel;
}
