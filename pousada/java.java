const textarea = document.querySelector('textarea');
const charCount = document.getElementById('char-count');
const maxLength = textarea.getAttribute('maxlength');

textarea.addEventListener('input', () => {
    const remaining = maxLength - textarea.value.length;
    charCount.textContent = `${remaining} caracteres restantes`;
});

<script>
    const textarea = document.querySelector('textarea');

    // Quando o usuário clicar no campo de texto
    textarea.addEventListener('focus', function() {
        this.placeholder = ''; // Remove o placeholder ao clicar
    });

    // Quando o campo de texto perde o foco (caso o usuário não digite nada)
    textarea.addEventListener('blur', function() {
        if (this.value === '') {
            this.placeholder = 'Diga sua experiência sobre nosso site...'; // Coloca o placeholder novamente se o campo estiver vazio
        }
    });
</script>
